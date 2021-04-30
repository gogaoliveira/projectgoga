package douglasoliveiraprojectgoga.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import douglasoliveiraprojectgoga.entities.Schedule;
import douglasoliveiraprojectgoga.repositories.ScheduleRepository;

@Service
public class ScheduleService {

	@Autowired
	private ScheduleRepository repository;
	
	public List<Schedule> findAll(){
		return repository.findAll();
	}
	
	public Schedule findById(long id) {
		Optional<Schedule> obj = repository.findById(id);
		return obj.get();
	}
	
	public Schedule insert(Schedule obj) {
		return repository.save(obj);
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
	
}
