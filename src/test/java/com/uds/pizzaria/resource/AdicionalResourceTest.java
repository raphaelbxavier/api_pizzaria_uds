package com.uds.pizzaria.resource;

import com.uds.pizzaria.repository.AdicionalRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AdicionalResourceTest {

    private AdicionalResource subject;

    @Mock
    private AdicionalRepository adicionalRepository;

    @Before
    public void before() {
        subject = new AdicionalResource(adicionalRepository);
    }

    @Test
    public void findAll() {
        subject.findAll();
        when(adicionalRepository.findAll()).thenReturn(mock(List.class));
        verify(adicionalRepository).findAll();
    }
}