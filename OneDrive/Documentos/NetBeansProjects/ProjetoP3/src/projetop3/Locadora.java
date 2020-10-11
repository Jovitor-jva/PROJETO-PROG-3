package projetop3;
import projetop3.Class1Atributos;
public class Locadora {
    private Class1Atributos[]vetor;
    private int cont;
	public Locadora() {
		vetor = new Class1Atributos[200]; 
		cont = 0;
        }
	public boolean cadastrarNovoCliente(String cpf) {
            for (Class1Atributos cliente : vetor) {
                if (cliente != null && cliente.getCpf() == cpf) {
				return false;
			}
		}
		vetor[cont] = new Class1Atributos(cpf);
		cont++;
		return true;
        }
	public boolean depositar(double valorDeposito, float valor) {
            Class1Atributos selecionada = null;
            for (Class1Atributos cliente : vetor) {
		if (cliente != null && vetor.getDeposito == valorDeposito) {
                    selecionada = cliente;
                    break;
                }
            }
            if (selecionada == null) {
		return false;
            }
        	selecionada.depositar(valor);
		return true;
        }
	public void sacar(int numero, float valor) throws ContainexistenteException, SaldoInsuficienteException {
		ContaGeral selecionada = null;
		for (ContaGeral conta : contas) {
			if (conta != null && conta.getNumero() == numero) {
				selecionada = conta;
				break;
			}
		}
		if (selecionada == null) {
			throw new ContainexistenteException();
		}
		selecionada.sacar(valor);
		
	}

	public boolean renderJuros(int numConta) {
		ContaGeral selecionada = null;
		for (ContaGeral conta : contas) {
			if (conta != null && conta.getNumero() == numConta) {
				selecionada = conta;
				break;
			}
		}
		if (selecionada == null) {
			return false;
		}
		
		if (selecionada instanceof Poupanca) {
			Poupanca p = (Poupanca)selecionada;
			p.rendeJuros();
			return true;
		} else {
			return false;
		}
				
	}

	@Override
	public int numContas() {
		return contadorDeContas;
	}

	@Override
	public float saldoTotal() {
		return 110000;
	}
}
}
