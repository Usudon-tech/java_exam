package com.example.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.domain.User;
import com.example.restapi.dto.UserRequest;
import com.example.restapi.dto.UserResponse;
import com.example.restapi.service.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;



/**
 * ユーザー情報を管理するREST APIコントローラー
 */
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET,
    RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class UserApiController {

    @Autowired
    private final UserService userService;

    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    // パスパラメータを使ったGETメソッド（GET /users/{id}）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getMethodName(@PathVariable Integer id) {
        User user = userService.findById(id);
        if(user == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(new UserResponse(user));
        }
    }
    
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public void getUserById() {
        return;
    }

    // クエリパラメータを使ったGETメソッド（GET /users/search）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/search")
    public ResponseEntity<UserResponse> getMethodName(@Valid @RequestBody User user) {
        List<User> userList = userService.searchUsers(user);
        if(user == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(new UserResponse(userList));
        }
    }
    @GetMapping("/search")
    public ResponseEntity<List<UserResponse>> searchUsers(
            @RequestParam(required=false) String name,
            @RequestParam(required=false) String email) {

    List<User> users = userService.searchUsers(name, email);

    return ResponseEntity.ok(
        users.stream().map(UserResponse::new).toList()
    );
}
    
    public void searchUsers() {
        return;
    }

    // POSTメソッドによるユーザー作成（POST /users）
    // 引数や戻り値は適宜修正してください
    @PostMapping("")
    public ResponseEntity<UserResponse> postMethodName(@Valid @RequestBody UserRequest userRequest) {
        User user = new User(null, userRequest.getName(), userRequest.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(new UserResponse(user));
    }
    
    public void createUser() {
        return;
    }

    // PUTメソッドによるユーザー更新（PUT /users/{id}）
    // 引数や戻り値は適宜修正してください
    public void updateUser() {
        return;
    }

}
