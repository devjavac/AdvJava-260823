package todo.dto;
// POJO, Encapsulated class, DTO, Bean, Domain, Entity etc.
public class TaskDto {
	private int id;
	private String title;
	private String status;
	private String scheduledOn;
	private String updatedOn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getScheduledOn() {
		return scheduledOn;
	}
	public void setScheduledOn(String scheduledOn) {
		this.scheduledOn = scheduledOn;
	}
	public String getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
	
}
