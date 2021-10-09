package za.ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.dto.Discovery_AdministratorDto;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.flow.Discovery_AdministratorFlow;


import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("Discovery_AdministratorController")
public class Discovery_AdministratorController {

    @GetMapping("/all")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class),
    })
    public ResponseEntity<GeneralResponse<List<Discovery_AdministratorDto>>>getAll() {
        List<Discovery_AdministratorDto> discovery_Administrator = discovery_AdministratorFlow.getAllDiscovery_Administrator();
        GeneralResponse<List<Discovery_AdministratorDto>> response = new GeneralResponse<List<Discovery_AdministratorDto>>(true, discovery_Administrator);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public GeneralResponse<String> GetAll() {
        return new GeneralResponse<String>(true, "No Types Found");
    }



    @Autowired
    public Discovery_AdministratorController(Discovery_AdministratorFlow discovery_AdministratorFlow) {
        this.discovery_AdministratorFlow = discovery_AdministratorFlow;
    }

    private final Discovery_AdministratorFlow discovery_AdministratorFlow;
}
