package com.example.calendar.app.backend.controller;

import com.example.calendar.app.backend.dynamodb.model.CalendarMeetup;
import com.example.calendar.app.backend.dynamodb.model.TimeSlot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.*;


@Controller
@RequestMapping(value = "/calendar")
public class CalendarController {

    private Map<UUID, CalendarMeetup> calendars = new HashMap<UUID, CalendarMeetup>();

    @GetMapping(value = "/{calendarId}")
    public @ResponseBody ResponseEntity<CalendarMeetup> getCalendar(@PathVariable Integer calendarId) {
        CalendarMeetup calendarMeetup = new CalendarMeetup();
        calendarMeetup.setTimeSlots();
    }

    @PostMapping(value = "{calendarId}/timeslot")
    public @ResponseBody CalendarMeetup createTimeSlot(@RequestBody TimeSlot timeSlot) {
        CalendarMeetup calendarMeetup = new CalendarMeetup();
        calendarMeetup.setTimeSlots();
    }

    private buildTimeSlot(){
        TimeSlot timeSlot = new TimeSlot();
        timeSlot.setStartDate();
        timeSlot();

        ArrayList<Integer> temp = new ArrayList<>();
        temp.remove()
    }
}
