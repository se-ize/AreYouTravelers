package com.example.travelers.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "receiver_requests")
public class ReceiverRequestsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String message;

    @Column(columnDefinition = "TINYINT(1)")
    private Boolean status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "rejected_at")
    private LocalDateTime rejectedAt;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private UsersEntity sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private UsersEntity receiver;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private BoardsEntity board;
}
