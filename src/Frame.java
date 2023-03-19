import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Frame extends JFrame {

	public Frame() {
		super("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(500, 300));
		Conversiones conversionesDefault = new Conversiones();

		setLayout(new BorderLayout());

		int bucle = 0;

		do {
			Object seleccionPesoOMasa = JOptionPane.showInputDialog(null, "Selecciona una opción de conversión: ",

					"Conversor Múltiple", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "Conversor de Monedas", "Conversor de Masas" }, "Selecciona");

			if (seleccionPesoOMasa != null) { // Si selecciona Cancelar no sigue

				String seleccionPesoMasa = seleccionPesoOMasa.toString();
				if (seleccionPesoMasa == "Conversor de Monedas") {

					String convertirAMonedas = JOptionPane.showInputDialog(null,
							"Ingrese la cantidad de dinero que desea convertir");

					if (convertirAMonedas.matches("[0-9]+")) {

						Double convertirAMonedas1 = Double.parseDouble(convertirAMonedas);
						Object seleccionDeMoneda = JOptionPane.showInputDialog(null,
								"Elije la moneda a la que deseas convertir tu dinero: ", "Monedas",
								JOptionPane.PLAIN_MESSAGE, null,
								new Object[] { "Pesos a Dólares", "Pesos a Euros",
										"Pesos a Libras Esterlinas", "Pesos a Yenes",
										"Pesos a Sur-Korean Won", "Dólar a Pesos", "Euros a Pesos",
										"Libras Esterlinas a Pesos", "Yenes a Pesos",
										"Sur-korean Won a Pesos" },
								"Pesos a Dólares");

						if (seleccionDeMoneda != null) {
							String seleccionMoneda = seleccionDeMoneda.toString();

							switch (seleccionMoneda) {
								case "Pesos a Dólares":
									JOptionPane.showMessageDialog(null, "la conversion de Ps a Dolares es: "
											+ conversionesDefault.PsaDolar(convertirAMonedas1) + " Dolares");
									break;
								case "Pesos a Euros":
									JOptionPane.showMessageDialog(null, "la conversion de Ps a Euros es: "
											+ conversionesDefault.PsaEuro(convertirAMonedas1) + " Euros");
									break;
								case "Pesos a Libras Esterlinas":
									JOptionPane.showMessageDialog(null,
											"la conversion de Mxn a Libras Esterlinas es: "
													+ conversionesDefault.PsaLibrasEsterlinas(convertirAMonedas1)
													+ " Libras Esterlinas");
									break;
								case "Pesos a Yenes":
									JOptionPane.showMessageDialog(null, "la conversion de Ps a Yenes es: "
											+ conversionesDefault.PsaYenes(convertirAMonedas1) + " Yenes");
									break;
								case "Pesos Sur-Korean Won":
									JOptionPane.showMessageDialog(null, "la conversion de Ps a Won es: "
											+ conversionesDefault.PsaWones(convertirAMonedas1) + " Won");
									break;
								case "Dólar a Pesos":
									JOptionPane.showMessageDialog(null, "la conversion de Dolares a Pesos es: "
											+ conversionesDefault.DolaraPs(convertirAMonedas1) + " Pesos");
									break;
								case "Euros a Pesos":
									JOptionPane.showMessageDialog(null, "la conversion de Euros a Pesos es: "
											+ conversionesDefault.YenesaPs(convertirAMonedas1) + " Pesos");
									break;
								case "Libras Esterlinas a Pesos":
									JOptionPane.showMessageDialog(null,
											"la conversion de Libras Esterlinas a Pesos es:: "
													+ conversionesDefault.LibrasEsterlinasaPs(convertirAMonedas1)
													+ " Pesos");
									break;
								case "Yenes a Pesos":
									JOptionPane.showMessageDialog(null, "la conversion de Yenes Pesos es: "
											+ conversionesDefault.YenesaPs(convertirAMonedas1) + " Pesos");
									break;
								case "Sur-Korean Won a Pesos":
									JOptionPane.showMessageDialog(null, "la conversion de Won a Pesos es: "
											+ conversionesDefault.WonesaPs(convertirAMonedas1) + " Pesos");
									break;
								default:
									break;
							}
						} else {
							JOptionPane.showMessageDialog(null, "Programa finalizado"); // en el segundo showinput
							break;
						}

					} else {
						JOptionPane.showMessageDialog(null, "valor no válido"); // numericos
					}

				} else {
					String convertirAMasa = JOptionPane.showInputDialog(null,
							"Ingrese la cantidad de Masa que desea convertir");

					if (convertirAMasa.matches("[0-9]+")) {
						Object seleccionDeMasa = JOptionPane.showInputDialog(null,
								"Elije el tipo de masa a la que deseas convertir: ", "Masas", JOptionPane.PLAIN_MESSAGE,
								null,
								new Object[] { "Gramos a Libras", "Gramos a Kilogramos",
										"Gramos a Toneladas", "Gramos a Libras",
										"Libras a Gramos",
										"Libras a Kilogramos", "Libras a Toneladas", "Kilogramos a Gramos",
										"Kilogramos a Libras", "Kilogramos a Toneladas",
										"Toneladas a Gramos", "Toneladas a Libras",
										"Toneladas a Kilogramos" },
								"Gramos a Kilogramos");
						Double convertirMasa = Double.parseDouble(convertirAMasa);

						if (seleccionDeMasa != null) {
							String seleccionMasa = seleccionDeMasa.toString();

							switch (seleccionMasa) {

								case "Gramos a Libras":
									JOptionPane.showMessageDialog(null, "la conversion de Gramos a Libras es: "
											+ conversionesDefault.gramosALibras(convertirMasa) + " Libras");
									break;
								case "Gramos a Kilogramos":
									JOptionPane.showMessageDialog(null, "la conversion de Gramos a Kilogramos es: "
											+ conversionesDefault.gramosAKg(convertirMasa) + " Kilogramos");
									break;
								case "Gramos a Toneladas":
									JOptionPane.showMessageDialog(null, "la conversion de Gramos a Toneladas es: "
											+ conversionesDefault.gramosATon(convertirMasa) + " Toneladas");
									break;
								case "Libras a Gramos":
									JOptionPane.showMessageDialog(null, "la conversion de Libras a Gramos es: "
											+ conversionesDefault.librasaGramos(convertirMasa) + " Gramos");
									break;
								case "Libras a Kilogramos":
									JOptionPane.showMessageDialog(null, "la conversion de Libras a Kilogramos es: "
											+ conversionesDefault.librasaKilos(convertirMasa) + " Kilogramos");
									break;
								case "Libras a Toneladas":
									JOptionPane.showMessageDialog(null, "la conversion de Libras a Toneladas es: "
											+ conversionesDefault.librasaToneladas(convertirMasa) + " Toneladas");
									break;
								case "Kilogramos a Gramos":
									JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Gramos es: "
											+ conversionesDefault.kgAgramos(convertirMasa) + " Gramos");
									break;
								case "Kilogramos a Libras":
									JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Libras es: "
											+ conversionesDefault.kgALibras(convertirMasa) + " Libras");
									break;
								case "Kilogramos a Toneladas":
									JOptionPane.showMessageDialog(null, "la conversion de Kilogramos a Toneladas es: "
											+ conversionesDefault.kgATon(convertirMasa) + " Toneladas");
									break;
								case "Toneladas a Gramos":
									JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Gramos es: "
											+ conversionesDefault.tonAgramos(convertirMasa) + " Gramos");
									break;
								case "Toneladas a Libras":
									JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Libras: "
											+ conversionesDefault.tonALibras(convertirMasa) + " Libras");
									break;
								case "Toneladas a Kilogramos":
									JOptionPane.showMessageDialog(null, "la conversion de Toneladas a Kilogramos es: "
											+ conversionesDefault.tonaKg(convertirMasa) + " Kilogramos");
									break;

								default:
									break;
							}
						} else {
							JOptionPane.showMessageDialog(null, "Programa finalizado");
							break;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor no valido");
					}

				}
				bucle = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
				if (bucle > 0) {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}

			} else {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			}

		} while (bucle == 0);

	}
}
