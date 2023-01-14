package com.example.calendar.app.backend.dynamodb.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class TimeSlot {

    private UUID participantId;

    private Date startDate;

    private Date endDate;

}
