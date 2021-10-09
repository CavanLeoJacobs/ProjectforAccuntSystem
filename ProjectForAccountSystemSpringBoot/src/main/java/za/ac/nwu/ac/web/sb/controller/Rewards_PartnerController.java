package za.ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.dto.Rewards_PartnerDto;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.flow.Rewards_PartnerFlow;

import java.util.List;

@Nullable
@SpringBootApplication
@RestController
@RequestMapping("Rewards_PartnerController")
public class Rewards_PartnerController
{

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured Account types.", notes = "Returns a list of account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class),
    })
    public ResponseEntity<GeneralResponse<List<Rewards_PartnerDto>>> getAll() {
        List<Rewards_PartnerDto> rewards_Partner = rewards_PartnerFlow.getAllRewards_Partner();
        GeneralResponse<List<Rewards_PartnerDto>> response = new GeneralResponse<List<Rewards_PartnerDto>>(true, rewards_Partner);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public GeneralResponse<String> GetAll() {
        return new GeneralResponse<String>(true, "No Types Found");
    }

    @Autowired
    public Rewards_PartnerController(Rewards_PartnerFlow rewards_PartnerFlow) {
        this.rewards_PartnerFlow = rewards_PartnerFlow;
    }
    private final Rewards_PartnerFlow rewards_PartnerFlow;

}