package com.spanner.spannerpoc;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class SpannerController {

    private SpannerDataService spannerDataService;

    @PostMapping("/user")
    public ResponseEntity<UserEntity> handleWorkRequest(@RequestBody User user) {
        UserEntity save = spannerDataService.save(user);
        return ResponseEntity.accepted().body(save);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserEntity> handleWorkRequest(
            @PathVariable("id") String id) {
        UserEntity save = spannerDataService.findById(id);
        return ResponseEntity.ok(save);
    }
}
