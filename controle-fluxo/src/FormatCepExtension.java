public class FormatCepExtension {
  public static void main(String[] args) {
   try {
    String cepFormatado = formatCep("2345678");
    System.out.println(cepFormatado);
  } catch (CepInvalidoException e) {
    System.err.println("CEP inválido.");
  }
  }
  static String formatCep (String cep) throws CepInvalidoException {
    if (cep.length() != 8) {
      throw new CepInvalidoException();
    }
    return "23.765-064";
  }
}



// sub categoria de exeções: check / unchecked
// 