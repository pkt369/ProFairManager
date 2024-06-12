package birdjun.profairmanager.user.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 20)
    private String phone;

    private String guardianName;

    @Column(length = 20)
    private String guardianPhone;

    @Column(nullable = false)
    private Short age;

    // 1: 남자, 0: 여자
    @Column(nullable = false, length = 1)
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}