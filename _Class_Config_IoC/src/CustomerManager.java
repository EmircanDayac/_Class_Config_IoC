
public class CustomerManager implements ICustomerService {
	IDal _dal;
	
	//setter injection
//	public void set_dal(IDal _dal) {
//		this._dal = _dal;
//	}

	//constructor injection
	public CustomerManager(IDal DAL) {
	this._dal = DAL;
	
}
	
	public void add() {
		this._dal.add();
	}

}
