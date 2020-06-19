
public class Time {
	private int hora;
	private int min;
	private int seg;
	private String per;
	
	public Time(int hora, int min, int seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;	
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}
	
	public String getPer() {
		return per;
	}

	public void setPer(String per) {
		this.per = per;
	}

	public String exibirHoraUniversal() {
		return formataNumero(hora)+":"+formataNumero(min)+":"+formataNumero(seg);
	}
	
	public String exibirHoraPadrao() {
		return formataNumero(hora)+":"+formataNumero(min)+":"+formataNumero(seg)+" "+per;
	}
	
	public void setTime(int h, int m, int s) {
		if (h<=12) {
			this.hora = h;
			this.per = "AM";
		}else if(h>12 || h == 00) {
			this.hora = h - 12;
			this.per = "PM";
		}
	}
	
	private String formataNumero(int num) {
		if (num < 10) {
			return "0"+num;
		}else {
			return num+"";
		}
	}
		
		

}
