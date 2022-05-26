package ExemploBanco;

public class Conta {
	public String dono;
	public int numConta;
	public boolean status;
	public String tipo;
	public float saldo;
	
// metodos especiais
	
	public Conta() {
		super();
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public void abriConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t=="CC") {
			this.setSaldo(50f); 
			System.out.print("Sua conta foi aberta com sucesso!\n");
		}if (t== "CP") {
			this.setSaldo(150f);
			System.out.print("Sua conta foi aberta com sucesso!\n");
		} 
	}
	public void fecharConta() {
		if (this.getSaldo() >0) {
			System.out.print("Não foi possivel fechar sua conta, pois foi encontrado dinheiro em conta."
					+ "Por favor retire o dinheiro em conta e tente novamente\n" );
		}if (this.getSaldo() > 0) {
			System.out.print("Não foi possivel fechar sua conta, pois foi encontrado um debito em conta."
					+ "Por favor procure uma agência perto de você\n");
		} else {
			this.setStatus(false);
			System.out.print("Sua conta foi fechada com sucesso!");
		}
	}
	public void depositar (float v) {
		if (status == true) {
			this.setSaldo(this.getSaldo() + v);
		} else {
			System.out.print("Não foi possivel localizar sua conta."
					+ "Por favor entre em contato com sua agência\n");
		}
	}
	public void sacar (float v) {
		if (status == true ) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
			}else {
				System.out.print("Saldo insuficiente para realizar saque\n");
			}
		} else {
			System.out.print("Não foi possivel localizar sua conta."
					+ "Por favor entre em contato com sua agência\n");
		}
	}
	public void mensalidade (float v) {
		
		if (tipo == "CC") {
			v =12;
		} if (tipo == "CP") {
			v =20;
		} 
		if (status == true) {
			if(saldo > v) {
				this.setSaldo(this.getSaldo() - v);
			} if (saldo < v) {
				System.out.print("Não foi possivel realizar debito. Saldo insuficiente\n");
			}
		} else {
			System.out.print("Não foi possivel localizar sua conta."
					+ "Por favor entre em contato com sua agência\n");
			}
	}

	public void extratoConta() {
		System.out.print("===========================================\n\n");
		System.out.print("PROPRIETÁRIO: " + this.getDono() +"\n");
		System.out.print("NUMERO DA CONTA: " + this.getNumConta() +"\n");
		System.out.print("SALDO: " + this.getSaldo() + "\n");
		System.out.print("TIPO: " + this.getTipo() +"\n");
		
	}
	

}
