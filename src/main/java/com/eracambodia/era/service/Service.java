package com.eracambodia.era.service;

import com.eracambodia.era.model.Pagination;
import com.eracambodia.era.model.User;
import com.eracambodia.era.model.api_agent_account_update.request.UpdateAgentAccount;
import com.eracambodia.era.model.api_building.response.Buildings;
import com.eracambodia.era.model.api_building_available.response.BuildingAvailable;
import com.eracambodia.era.model.api_building_status_update.request.BuildingStatusUpdate;
import com.eracambodia.era.model.api_building_uuid.response.BuildingUUID;
import com.eracambodia.era.model.api_login.request.Login;
import com.eracambodia.era.model.api_register.request.Register;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Service {
    // api/login
    User findUserByEmailOfLogin(String email);
    String checkLogin(Login login);

    // api/building/uuid
    BuildingUUID findBuildingByUUID(String uuid);

    // api/building
    List<Buildings> findBuildings(Pagination pagination);
    int countBuildingsRecord();

    // api/building/status/update
    Object updateBuildingStatus(BuildingStatusUpdate buildingStatusUpdate);
    Integer findBuildingIdByIdOfBuildingStatusUpdate(int ownerId);

    // api/building/available
    List<BuildingAvailable> findBuildingAvailable(Pagination pagination);

    // api/register
    void register(Register register);
    String getEmail(String email);

    // api/user
    com.eracambodia.era.model.api_usesr.response.User findUserByUsernameOfUser(String username);

    // api/agent/profile/upload
    String findImageByUsernameOfUploadProfileAgent(String email);
    void updateImageProfileOfUploadProfileAgent(String image,String email);

    // api/agent/account/password
    void updateUserPassword(String password,String email);
    String getUserPasswordByEmail(String email);

    //api/agent/account/update
    void updateUserInformation(UpdateAgentAccount updateAgentAccount, String email);

}