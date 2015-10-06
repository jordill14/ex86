/*
 * Cotxe.java        1.0 02/10/2015
 *
 * class Cotxe
 *
 * Copyright 2015 Jordi Llonch Neira <jordill14@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Cotxe {

	private String marca;
	private String modelo;
	private int cilindrada;
	private int nCilindro;
	private double pFiscal;

	public Cotxe(String marca, String modelo, int cilindrada, int nCilindro) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.nCilindro = nCilindro;
		this.pFiscal = calcPFiscal();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getnCilindro() {
		return nCilindro;
	}

	public void setnCilindro(int nCilindro) {
		this.nCilindro = nCilindro;
	}

	public double pFiscal() {
		return pFiscal;
	}

	public double calcPFiscal() {
		return (0.08 * getnCilindro() * Math.pow((getCilindrada() / getnCilindro()), 0.6));
	}

	public String toString() {
		return getMarca() + "\t" + getModelo() + "\t" + getnCilindro() + "\t" + getCilindrada() + "\t" + pFiscal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cilindrada;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + nCilindro;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cotxe other = (Cotxe) obj;
		if (cilindrada != other.cilindrada)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (nCilindro != other.nCilindro)
			return false;
		return true;
	}

	public double getpFiscal() {
		return pFiscal;
	}

	public void setpFiscal(double pFiscal) {
		this.pFiscal = pFiscal;
	}

}
