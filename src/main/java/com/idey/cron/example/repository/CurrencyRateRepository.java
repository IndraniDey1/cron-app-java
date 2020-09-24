package com.idey.cron.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idey.cron.example.model.CurrencyRate;

public interface CurrencyRateRepository extends JpaRepository<CurrencyRate, Long> {
}
