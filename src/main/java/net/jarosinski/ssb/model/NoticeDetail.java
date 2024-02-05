package net.jarosinski.ssb.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "notice_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoticeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "notice_id")
    private Long noticeId;

    @Column(name = "notice_summary", length = 200)
    private String noticeSummary;

    @Column(name = "notice_details", length = 500)
    private String noticeDetails;

    @Column(name = "notic_beg_dt")
    private LocalDate noticeBeginDt;

    @Column(name = "notic_end_dt")
    private LocalDate noticeEndDt;

    @Column(name = "create_dt")
    private LocalDate createDt;

    @Column(name = "update_dt")
    private LocalDate updateDt;
}
