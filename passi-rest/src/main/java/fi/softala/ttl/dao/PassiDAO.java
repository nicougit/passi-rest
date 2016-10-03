/**
 * @author Mika Ropponen
 */
package fi.softala.ttl.dao;

import java.util.List;

import fi.softala.ttl.model.WorksheetAnswer;
import fi.softala.ttl.model.User;
import fi.softala.ttl.model.Worksheet;

public interface PassiDAO {
	
	public User findUser(String username);
	
	public List<Worksheet> getWorksheets(int groupID);
	
	public boolean isAnswerExist(int worksheetID);
	
	public void saveAnswer(WorksheetAnswer answer);
	
	public boolean deleteAnswer(int worksheetID, String username);
}