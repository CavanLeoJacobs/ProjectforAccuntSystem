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
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.flow.MemberFlow;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("MemberController")
public class MemberController
{
    @GetMapping("/all")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class),
    })
    public ResponseEntity<GeneralResponse<List<MemberDto>>> getAll() {
        List<MemberDto> member = memberFlow.getAllMember();
        GeneralResponse<List<MemberDto>> response = new GeneralResponse<List<MemberDto>>(true, member);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public GeneralResponse<String> GetAll() {
        return new GeneralResponse<String>(true, "No Types Found");
    }
    @Autowired
    public MemberController(MemberFlow memberFlow) {
        this.memberFlow = memberFlow;
    }
    private final MemberFlow memberFlow;

}
