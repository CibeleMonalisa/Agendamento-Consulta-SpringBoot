package com.appointment.appointment.enums;

public enum StatusAppointment {
    OPEN, //quando a consulta estiver aberta
    CANCELED, //quando a consulta for cancelada (não gera receita)
    FINISHED; //gera a receita
}
