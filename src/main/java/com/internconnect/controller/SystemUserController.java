package com.internconnect.controller;
import com.internconnect.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.internconnect.service.UserService;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/v1")
public class SystemUserController {
    @Autowired
    private UserService userService;

    @GetMapping("/systemUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/systemUsers/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getSingleUser(id);
    }

    @PostMapping("/systemUsers")
    public User saveUser (@RequestBody User user){
        return userService.saveUser(user);
    }
    @PutMapping("/systemUsers/{id}")
    public User updateUser(@PathVariable Integer id, @RequestParam User user){
        user.setId(id);
        return userService.updateUser(user);
    }
    @DeleteMapping("/systemUsers")
    public void deleteUser(@RequestParam Long id){
        userService.deleteUser(id);
    }
    @GetMapping("/systemUsers/filterByName")
    public ResponseEntity<List<User>> getUsersByName(@RequestParam String name){
        return new ResponseEntity<List<User>>(userService.getUsersByName(name), HttpStatus.OK);
    }

    @GetMapping("/systemUsers/filterByNameAndAddress")
    public ResponseEntity<List<User>> getUsersByNameAndAddress(@RequestParam String name, @RequestParam String address){
        return new ResponseEntity<List<User>>(userService.getUsersByNameAndAddress(name, address), HttpStatus.OK);
    }
}
