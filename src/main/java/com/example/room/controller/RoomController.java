package com.example.room.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoomController {

    private String roomId;

    @PostMapping("/setRoomId")
    public ResponseEntity<String> setRoomId(@RequestBody Request request) {
        roomId = request.s;
        return ResponseEntity.ok("SET:OK"); // Return 200 OK with the response message
    }
    @PostMapping("/submit")
    public ResponseEntity<String> submitGameData(@RequestBody Request request) {
        String responseMessage = "received: " + request.s;
        return ResponseEntity.ok(responseMessage); // Return 200 OK with the response message
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Room";
    }
    @GetMapping("/helloFromRoom")
    public String sayHelloFromRoom() {
        return "Hello from Room";
    }
}