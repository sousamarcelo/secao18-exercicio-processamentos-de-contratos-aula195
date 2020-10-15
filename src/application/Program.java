package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Prestacao;
import model.service.ContratoService;
import model.service.Paypal;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		Double valorTotal = sc.nextDouble();
		Contrato contrato = new Contrato(number, data, valorTotal);
		
		System.out.print("Enter number of installments: ");
		Integer quantidadeDeMeses = sc.nextInt();
		
		ContratoService contratoService = new ContratoService(new Paypal());
		contratoService.processandoContrado(contrato, quantidadeDeMeses);
		
		
		System.out.println("Prestações: ");
		for(Prestacao p : contrato.getLista()) {
			System.out.println(p);
		}
		
		
		
		sc.close();

	}

}
