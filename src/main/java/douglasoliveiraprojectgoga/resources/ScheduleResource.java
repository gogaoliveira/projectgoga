package douglasoliveiraprojectgoga.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import douglasoliveiraprojectgoga.entities.Schedule;
import douglasoliveiraprojectgoga.services.ScheduleService;

@RestController
@RequestMapping(value = "/users")
public class ScheduleResource {
	
	@Autowired
	private ScheduleService service;
	
	@GetMapping
	public ResponseEntity<List<Schedule>> findAll(){
		List<Schedule> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Schedule> findById(@PathVariable Long id){
		Schedule obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	public ResponseEntity<Schedule> insert(@PathVariable Schedule obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	

}
