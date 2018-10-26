package com.eracambodia.era.repository.api_agent_members_direct_uuid;

import com.eracambodia.era.model.api_agent_members_direct_uuid.response.AgentMemberDirect;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgentMembersDirectRepo {
    @Select("SELECT id " +
            "FROM users " +
            "WHERE uuid=#{uuid}")
    Integer getUserParentId(String uuid);

    @Select("SELECT uuid,username,phonenumber,email,parent_id,image " +
            "FROM users " +
            "WHERE parent_id=#{parentId} AND authority_id=3")
    @Results({
            @Result(property = "profilePhoto", column = "image"),
            @Result(property = "name", column = "username"),
            @Result(property = "phone", column = "phonenumber"),
            @Result(property = "parent", column = "parent_id", one = @One(select = "getParent"))
    })
    List<AgentMemberDirect> findAgentMemberDirect(int parentId);

    @Select("SELECT username " +
            "FROM users " +
            "WHERE id=#{parent_id}")
    String getParent();

    @Select("SELECT COUNT(id) " +
            "FROM users " +
            "WHERE parent_id=#{parentId} AND authority_id=3")
    Integer countAgent(int parentId);
}
