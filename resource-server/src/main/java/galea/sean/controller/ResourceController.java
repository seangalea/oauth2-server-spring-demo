package galea.sean.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resource")
@Slf4j
public class ResourceController {
    @GetMapping(
            value = "/hello",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getHelloWorld(@RequestParam(required = false) String text) {
        return ResponseEntity.ok("Hello " + text);
    }

    @PostMapping(
            value = "/hello",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @PreAuthorize("hasAuthority('CAN_WRITE')")
    public ResponseEntity<?> write() {
        return ResponseEntity.ok("Hello User. If this method was implemented, you would have had the right to POST a resource.");
    }
}
