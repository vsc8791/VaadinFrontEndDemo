package com.vsc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsc.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
