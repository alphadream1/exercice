
package packageObjet;

public class EleveBean {

	private long id;
	private int note;
	private String nom;

	public EleveBean() {
		super();
	}

	public EleveBean(int note, String nom) {
		super();
		this.note = note;
		this.nom = nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getNom() {
		return nom;
	}

	public int getNote() {
		return note;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}
}