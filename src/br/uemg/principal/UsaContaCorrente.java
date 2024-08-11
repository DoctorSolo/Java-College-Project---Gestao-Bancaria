package br.uemg.principal;

import br.uemg.cliente.Endereco;
import br.uemg.contas.Agencia;
import br.uemg.contas.ContaCorrente;

public class UsaContaCorrente {
	
	public static void main(String[] args) {
		Endereco and1 = new Endereco("sfjs","fsfl", "sjslf", "45895", "2344");
		Agencia ag1 = new Agencia("5784", and1);
		System.out.println(ag1);
		/*
		 * 
		 * 
		 * 
		 * 
		 *  ____________________________________________________________________________
		 *                                                                             /
		 *                                                                            //
		 *                                                                           ///________
		 *                                                                          ////      //                   /
		 *  _______________________________________________________________________/////     //                   /
		 *  ______________________|  _      _      |_______________________________////     //                   /
		 *  _____|  | |___________| / \ |) |_ |\ | |_______________________________///     //                   /
		 *  _____| �| |___________| \_/ |  |_ | \| |_______________________________//     //                   /
		 *  _____|__|_|___________|________________|_______________________________/     //                   /
		 * 																				//                   /
		 * 																			   //                   /
		 * 																			  //                   /
		 * 																			 //                   /
		 *  ________________________________________________________________________//                   /
		 *  ________________________________________________________________________/                   /
		 * 																	   ____                    /
		 *  __  ____  ____  ____  ____  _____  _____  _____  ______   _____   ____                    /
		 * 																	 ____                    /
		 * 																	____                    /
		 *  _______________________________________________________________________________________/
		 * 
		 *
		 */
		
		ContaCorrente cc1 = new ContaCorrente("127373-x",200.00F,1000.00F,"10/04/2004");
		ContaCorrente cc2 = new ContaCorrente("156371-x",100.00F,2000.00F,"10/04/2004");
		System.out.println(cc1); // imprime o relatorio
		
		cc1.depositar(300.00F);
		System.out.println("\n" + cc1);
		
		sacar(cc1, 500.00F);
		System.out.println("\n" + cc1);
		
		System.out.println((float) (0.8-0.1));
	}
	
	private static void sacar(ContaCorrente cc, float valor) {
		if (cc.sacar(10000.00f)) {
			System.out.println("\nSaque realizado com sucesso..\n");
		} else {
			System.out.println("\nSaque n�o realizado.....\n");
		}
	}
}
