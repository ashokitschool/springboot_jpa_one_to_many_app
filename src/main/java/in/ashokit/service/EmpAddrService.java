package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddrRepo;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpAddrService {

	@Autowired
	private EmpRepo empRepo;

	@Autowired
	private AddrRepo addrRepo;

	public void saveEmpWithAddr() {
		Address a1 = new Address();
		a1.setCity("Hyd");
		a1.setState("TG");
		a1.setType("Present");

		Address a2 = new Address();
		a2.setCity("Guntur");
		a2.setState("AP");
		a2.setType("Permanent");

		Employee e = new Employee();
		e.setEmpName("Ashok");
		e.setEmpSalary(10000.00);

		// associating emp obj to address data
		a1.setEmp(e);
		a2.setEmp(e);

		List<Address> addressesList = Arrays.asList(a1, a2);

		// associating addresses objs to emp data
		e.setAddr(addressesList);

		empRepo.save(e);
	}

	public void deleteEmp(int id) {
		empRepo.deleteById(id);
	}

	public void getEmp(int id) {
		empRepo.findById(id);
	}

	public void getAddr(int id) {
		addrRepo.findById(id);
	}

	public void deleteAddress(int addrId) {
		addrRepo.deleteById(addrId);
	}
}
