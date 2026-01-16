package com.borsibaar.controller;

import com.borsibaar.dto.MeResponseDto;
import com.borsibaar.dto.OnboardingRequestDto;
import com.borsibaar.service.AccountService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping
    public ResponseEntity<MeResponseDto> me() {
        return ResponseEntity.ok(accountService.getCurrentUserSummary());
    }

    @PostMapping("/onboarding")
    @Transactional
    public ResponseEntity<Void> finish(@Valid @RequestBody OnboardingRequestDto req) {
        accountService.completeOnboarding(req);
        return ResponseEntity.noContent().build();
    }

}
