
import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value = "internationalizationBean")
@SessionScoped
public class InternationalizationBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String locale;


	public String changeLocale() {
		System.out.println("InternationalizationBean.changeLocal() : ENTRADA");
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(new Locale(this.locale));
		return locale;
	}
	
	
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

}
