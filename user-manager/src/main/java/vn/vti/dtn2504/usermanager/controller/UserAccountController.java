package vn.vti.dtn2504.usermanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.vti.dtn2504.common.api.response.ApiResponse;
import vn.vti.dtn2504.usermanager.dto.request.CreateAccountRequest;
import vn.vti.dtn2504.usermanager.dto.response.CreateAccountResponse;
import vn.vti.dtn2504.usermanager.service.UserService;

@RestController
@RequestMapping(value = "/api/v1/user/accounts")
@RequiredArgsConstructor
public class UserAccountController {
  private final UserService userService;

  @PostMapping
  public ResponseEntity<ApiResponse<CreateAccountResponse>> createAccount(
      @RequestBody CreateAccountRequest request
  ){
    CreateAccountResponse response = userService.createAccount(request);
    return ResponseEntity.ok(ApiResponse.success(response));
  }
}
