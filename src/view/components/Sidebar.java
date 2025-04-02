package view.components;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.util.Objects;

public class Sidebar extends VBox {

    public Button btnFonecedor = new Button("Fonecedores");
    public Button btnProduto = new Button("Produtos");
    public Button btnCliente = new Button("Clientes");
    public Button btnPedido = new Button("Pedidos");

    //contrutor para inicializar o componentes (como um objeto) em outras janelas

    public Sidebar(){

        getChildren().addAll( btnFonecedor,btnProduto, btnCliente, btnPedido);

        Image fornecedorIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/view/img/iconFornecedor.png")));
        Image clienteIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/view/img/iconClientes.png")));
        Image produtoIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/view/img/iconProdutos.png")));
        Image pedidoIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/view/img/iconPedidos.png")));

        ImageView imgViewIconCliente = new ImageView(clienteIcon);
        imgViewIconCliente.setFitHeight(25);
        imgViewIconCliente.setFitWidth(25);
        btnCliente.setGraphic(imgViewIconCliente);

        ImageView imgViewIconFornecedor = new ImageView(fornecedorIcon);
        imgViewIconFornecedor.setFitHeight(25);
        imgViewIconFornecedor.setFitWidth(25);
        btnFonecedor.setGraphic(imgViewIconFornecedor);

        ImageView imgViewIconPedido = new ImageView(pedidoIcon);
        imgViewIconPedido.setFitHeight(25);
        imgViewIconPedido.setFitWidth(25);
        btnPedido.setGraphic(imgViewIconPedido);

        ImageView imgViewIconProduto = new ImageView(produtoIcon);
        imgViewIconProduto.setFitHeight(25);
        imgViewIconProduto.setFitWidth(25);
        btnProduto.setGraphic(imgViewIconProduto);

        //Estilo personalizado para o botão
        String StyleButton = "-fx-backgroud-color: transparent; " +
                "-fx-border-color: transparent; " +
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold;  " +
                "-fx-text-fill: #008248; " +
                " -fx-alignment: center; " +
                "-fx-min-width: 200px; " +
                "-fx-min-height: 50px; " +
                "-fx-translate-x: 10px" +
                "-fx-graphic-text-gap: 10px";


        btnCliente.setStyle(StyleButton);
        btnProduto.setStyle(StyleButton);
        btnPedido.setStyle(StyleButton);
        btnFonecedor.setStyle(StyleButton);

    }


}
