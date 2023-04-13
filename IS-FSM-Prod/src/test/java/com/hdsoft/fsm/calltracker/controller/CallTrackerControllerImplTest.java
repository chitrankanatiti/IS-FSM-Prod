package com.hdsoft.fsm.calltracker.controller;

import com.hdsoft.fsm.calltracker.mapper.CallTrackerMapper;
import com.hdsoft.fsm.calltracker.model.CallTracker;
import com.hdsoft.fsm.calltracker.service.CallTrackerService;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class CallTrackerControllerImplTest {
    //TODO: create the data Test generator class CallTrackerBuilder
    private static final String ENDPOINT_URL = "/call-trackers";
    @MockBean
    private ReferenceMapper referenceMapper;
    @InjectMocks
    private CallTrackerController calltrackerController;
    @MockBean
    private CallTrackerService calltrackerService;
    @MockBean
    private CallTrackerMapper calltrackerMapper;
    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(this.calltrackerController).build();
    }

    @Test
    public void getAll() throws Exception {
        Mockito.when(calltrackerMapper.asDTOList(ArgumentMatchers.any())).thenReturn(CallTrackerBuilder.getListDTO());

        Mockito.when(calltrackerService.findAll()).thenReturn(CallTrackerBuilder.getListEntities());
        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));

    }

    @Test
    public void getById() throws Exception {
        Mockito.when(calltrackerMapper.asDTO(ArgumentMatchers.any())).thenReturn(CallTrackerBuilder.getDTO());

        Mockito.when(calltrackerService.findById(ArgumentMatchers.anyLong())).thenReturn(java.util.Optional.of(CallTrackerBuilder.getEntity()));

        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));
        Mockito.verify(calltrackerService, Mockito.times(1)).findById(1L);
        Mockito.verifyNoMoreInteractions(calltrackerService);
    }

    @Test
    public void save() throws Exception {
        Mockito.when(calltrackerMapper.asEntity(ArgumentMatchers.any())).thenReturn(CallTrackerBuilder.getEntity());
        Mockito.when(calltrackerService.save(ArgumentMatchers.any(CallTracker.class))).thenReturn(CallTrackerBuilder.getEntity());

        mockMvc.perform(
                        MockMvcRequestBuilders.post(ENDPOINT_URL)
                                .contentType(MediaType.APPLICATION_JSON_UTF8)
                                .content(CustomUtils.asJsonString(CallTrackerBuilder.getDTO())))
                .andExpect(MockMvcResultMatchers.status().isCreated());
        Mockito.verify(calltrackerService, Mockito.times(1)).save(ArgumentMatchers.any(CallTracker.class));
        Mockito.verifyNoMoreInteractions(calltrackerService);
    }

    @Test
    public void update() throws Exception {
        Mockito.when(calltrackerMapper.asEntity(ArgumentMatchers.any())).thenReturn(CallTrackerBuilder.getEntity());
        Mockito.when(calltrackerService.update(ArgumentMatchers.any(), ArgumentMatchers.anyLong())).thenReturn(CallTrackerBuilder.getEntity());

        mockMvc.perform(
                        MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
                                .contentType(MediaType.APPLICATION_JSON_UTF8)
                                .content(CustomUtils.asJsonString(CallTrackerBuilder.getDTO())))
                .andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(calltrackerService, Mockito.times(1)).update(ArgumentMatchers.any(CallTracker.class), ArgumentMatchers.anyLong());
        Mockito.verifyNoMoreInteractions(calltrackerService);
    }

    @Test
    public void delete() throws Exception {
        Mockito.doNothing().when(calltrackerService).deleteById(ArgumentMatchers.anyLong());
        mockMvc.perform(
                        MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1"))
                .andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(calltrackerService, Mockito.times(1)).deleteById(Mockito.anyLong());
        Mockito.verifyNoMoreInteractions(calltrackerService);
    }