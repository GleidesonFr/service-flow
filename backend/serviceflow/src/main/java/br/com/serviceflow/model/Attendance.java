package br.com.serviceflow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = Attendance.TABLE)
public class Attendance {
    private static final String TABLE = "attendance";
}
