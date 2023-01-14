package com.example.calendar.app.backend.dynamodb.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class CalendarMeetup {

    private UUID id;

    private List<TimeSlot> timeSlots;

}
