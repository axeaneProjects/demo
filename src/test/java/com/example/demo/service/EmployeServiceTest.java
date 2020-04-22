package com.example.demo.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeServiceTest {

    @Autowired
    private EmployeService employeService;

    @MockBean
    private DepartementService departementService;

    @Before
    public void initTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnInfo(){
        given(this.departementService.getDepartement(1L)).willReturn("Info");
        String departement = employeService.getDepartementById(1L);
        assertEquals("Info", departement);
    }
    @Test
    public void shouldReturnAutres(){
        given(this.departementService.getDepartement(2L)).willReturn("Autres");
        String departement = employeService.getDepartementById(2L);
        assertEquals("Autres", departement);
    }
}
