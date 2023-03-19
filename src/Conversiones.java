
import java.text.DecimalFormat;

public class Conversiones {
	DecimalFormat df = new DecimalFormat("#.##");

	public String PsaDolar(double valor) {
		valor = valor / 210;
		return df.format(valor);
	}

	public String PsaEuro(double valor) {

		valor = valor / 215;
		return df.format(valor);

	}

	public String PsaLibrasEsterlinas(double valor) {
		valor = valor / 243;
		return df.format(valor);
	}

	public String PsaYenes(double valor) {
		valor = valor * 1.52;
		return df.format(valor);
	}

	public String PsaWones(double valor) {
		valor = valor * 0.15;
		return df.format(valor);
	}

	public String DolaraPs(double valor) {
		valor = valor * 210;
		return df.format(valor);
	}

	public String EuroaPs(double valor) {
		valor = valor * 215;
		return df.format(valor);

	}

	public String LibrasEsterlinasaPs(double valor) {
		valor = valor * 243;
		return df.format(valor);
	}

	public String YenesaPs(double valor) {
		valor = valor * 1.52;
		return df.format(valor);
	}

	public String WonesaPs(double valor) {
		valor = valor * 0.15;
		return df.format(valor);
	}

	public String kgAgramos(double valor) {
		valor = valor * 1000;
		return df.format(valor);
	}

	public String kgATon(double valor) {
		valor = valor * 0.001;
		return df.format(valor);
	}

	public String gramosAKg(double valor) {
		valor = valor / 1000;
		return df.format(valor);
	}

	public String gramosATon(double valor) {
		valor = valor / 1000000;
		return df.format(valor);
	}

	public String tonAgramos(double valor) {
		valor = valor * 1000000;
		return df.format(valor);
	}

	public String tonaKg(double valor) {
		valor = valor * 1000;
		return df.format(valor);
	}

	public String gramosALibras(double valor) {
		valor = valor * 0.0022046226;
		return df.format(valor);
	}

	public String librasaGramos(double valor) {
		valor = valor * 453.59237;
		return df.format(valor);
	}

	public String librasaKilos(double valor) {
		valor = valor * 0.45359237;
		return df.format(valor);
	}

	public String librasaToneladas(double valor) {
		valor = valor * 0.0004535924;
		return df.format(valor);
	}

	public String kgALibras(double valor) {
		valor = valor / 0.45359237;
		return df.format(valor);
	}

	public String tonALibras(double valor) {
		valor = valor / 0.0004535924;
		return df.format(valor);
	}

}
