package views;

import controlers.SettingsControlers;

public class SistemView extends javax.swing.JFrame {

    public SistemView() {
        initComponents();
        setSize(1000,680);
        setResizable(false);
        setTitle("Panel de Administracion");
        setLocationRelativeTo(null);
        
        //Controlador del settings
        SettingsControlers settings = new SettingsControlers(this);
        this.repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        logo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cabezado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        barraIzquierda = new javax.swing.JPanel();
        jPanelProducts = new javax.swing.JPanel();
        jLabelProducts = new javax.swing.JLabel();
        jPanelPurchase = new javax.swing.JPanel();
        jLabelPurchase = new javax.swing.JLabel();
        jPanelCustomer = new javax.swing.JPanel();
        jLabelCustomer = new javax.swing.JLabel();
        jPanelEmployee = new javax.swing.JPanel();
        jLabelEmployee = new javax.swing.JLabel();
        jPanelSuppliers = new javax.swing.JPanel();
        jLabelSuppliers = new javax.swing.JLabel();
        jPanelCategory = new javax.swing.JPanel();
        jLabelCategory = new javax.swing.JLabel();
        jPanelReport = new javax.swing.JPanel();
        jLabelReport = new javax.swing.JLabel();
        jPanelSettings = new javax.swing.JPanel();
        jLabelSettings = new javax.swing.JLabel();
        MainContent = new javax.swing.JTabbedPane();
        Products = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Code = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        Category1 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtProductCode = new javax.swing.JTextField();
        txtProductPrice = new javax.swing.JTextField();
        txtProductDescription = new javax.swing.JTextField();
        cmbProductCategory = new javax.swing.JComboBox<>();
        txtProductId = new javax.swing.JTextField();
        btnProductsRegister = new javax.swing.JButton();
        btnProductsDelete = new javax.swing.JButton();
        btnProductsModify = new javax.swing.JButton();
        btnProductsCancel = new javax.swing.JButton();
        Code1 = new javax.swing.JLabel();
        searchProducts = new javax.swing.JLabel();
        txtProductSearch = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        Purchase = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        productCode = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        supplier = new javax.swing.JLabel();
        purchasePrice = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        txtPurchaseProductCode = new javax.swing.JTextField();
        txtPurchaseProductName = new javax.swing.JTextField();
        txtPurchaseAmount = new javax.swing.JTextField();
        txtPurchasePrice = new javax.swing.JTextField();
        txtPurchaseSubtotal = new javax.swing.JTextField();
        txtPurchaseId = new javax.swing.JTextField();
        txtPurchaseTotalprice = new javax.swing.JTextField();
        btnPurchaseAdd = new javax.swing.JButton();
        btnPurchaseDelete = new javax.swing.JButton();
        btnPurchaseBuy = new javax.swing.JButton();
        btnPurchaseNew = new javax.swing.JButton();
        cbmPurchaseSuppliers = new javax.swing.JComboBox<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        purchaseTable = new javax.swing.JTable();
        Clients = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        description3 = new javax.swing.JLabel();
        fullName3 = new javax.swing.JLabel();
        adress3 = new javax.swing.JLabel();
        telephone3 = new javax.swing.JLabel();
        mail3 = new javax.swing.JLabel();
        txtClienIdentification = new javax.swing.JTextField();
        txtClientFullName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtClientAdress = new javax.swing.JTextField();
        txtClientTelephone = new javax.swing.JTextField();
        txtClientMail = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtClientSearch = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableClients = new javax.swing.JTable();
        Employee = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        identification = new javax.swing.JLabel();
        fullName = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        rol = new javax.swing.JLabel();
        direction = new javax.swing.JLabel();
        telephone = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txtEmployeeIdentifaction = new javax.swing.JTextField();
        txtEmployeeFullName = new javax.swing.JTextField();
        txtEmployeeUserName = new javax.swing.JTextField();
        txtEmployeeDirecction = new javax.swing.JTextField();
        txtEmployeeTelephone = new javax.swing.JTextField();
        txtEmployeeMail = new javax.swing.JTextField();
        btnEmployeeRegister = new javax.swing.JButton();
        btnEmployeeDelete = new javax.swing.JButton();
        btnEmployeeModify = new javax.swing.JButton();
        btnEmployeeCancel = new javax.swing.JButton();
        cmbEmployeeRol = new javax.swing.JComboBox<>();
        txtEmployeePassword = new javax.swing.JPasswordField();
        search = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtEmployeeSearch = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        Suppliers = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        name5 = new javax.swing.JLabel();
        direction5 = new javax.swing.JLabel();
        telephone5 = new javax.swing.JLabel();
        mail5 = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        txtSuppliersName = new javax.swing.JTextField();
        txtSuppliersDirection = new javax.swing.JTextField();
        txtSuppliersTelephone = new javax.swing.JTextField();
        txtSuppliersDescription = new javax.swing.JTextField();
        txtSuppliersMail = new javax.swing.JTextField();
        btnSuppliersRegister1 = new javax.swing.JButton();
        btnSuppliersDelete1 = new javax.swing.JButton();
        btnSuppliersModify = new javax.swing.JButton();
        btnSuppliersCancel = new javax.swing.JButton();
        cbmSuppliersCity = new javax.swing.JComboBox<>();
        search1 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtEmployeeSearch1 = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        SuppliersTable = new javax.swing.JTable();
        Category = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        id6 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        txtSuppliersName2 = new javax.swing.JTextField();
        txtCategoryName1 = new javax.swing.JTextField();
        btnCategoryRegister = new javax.swing.JButton();
        btnCategoryDelete = new javax.swing.JButton();
        btnCategoryModify = new javax.swing.JButton();
        btnCategoryCancel = new javax.swing.JButton();
        search6 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtEmployeeSearch2 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        SuppliersTable1 = new javax.swing.JTable();
        Reports = new javax.swing.JPanel();
        Purchases = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAllPurchases = new javax.swing.JTable();
        Profile = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        identification8 = new javax.swing.JLabel();
        fullName8 = new javax.swing.JLabel();
        address8 = new javax.swing.JLabel();
        telephone8 = new javax.swing.JLabel();
        newPassword = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JLabel();
        txtProfileIdentification = new javax.swing.JTextField();
        txtProfileFullName = new javax.swing.JTextField();
        txtProfileAdress = new javax.swing.JTextField();
        txtProfileConfirmPassword = new javax.swing.JTextField();
        txtProfileTelephone = new javax.swing.JTextField();
        btnProfileModify = new javax.swing.JButton();
        mail8 = new javax.swing.JLabel();
        txtProfileMail = new javax.swing.JTextField();
        txtProfileNewPassword = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setBackground(new java.awt.Color(10, 81, 109));
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\leduc\\Desktop\\Universidad\\cursos\\Java\\00Proyectos\\Farmacia\\build\\classes\\images\\logo.jpg")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, Short.MAX_VALUE)
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, Short.MAX_VALUE)
        );

        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 130));

        cabezado.setBackground(new java.awt.Color(35, 15, 43));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pharmacy+ ");

        btnFoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\leduc\\Desktop\\Universidad\\cursos\\Java\\00Proyectos\\Farmacia\\build\\classes\\images\\man.png")); // NOI18N
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogOut.setText("Exit");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cabezadoLayout = new javax.swing.GroupLayout(cabezado);
        cabezado.setLayout(cabezadoLayout);
        cabezadoLayout.setHorizontalGroup(
            cabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezadoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        cabezadoLayout.setVerticalGroup(
            cabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezadoLayout.createSequentialGroup()
                .addGroup(cabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabezadoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(cabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cabezadoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(cabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 830, 130));

        barraIzquierda.setBackground(new java.awt.Color(242, 29, 65));
        barraIzquierda.setPreferredSize(new java.awt.Dimension(170, 500));

        jPanelProducts.setBackground(new java.awt.Color(242, 29, 65));

        jLabelProducts.setBackground(new java.awt.Color(242, 29, 65));
        jLabelProducts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelProducts.setForeground(new java.awt.Color(0, 0, 0));
        jLabelProducts.setIcon(new javax.swing.ImageIcon("C:\\Users\\leduc\\Desktop\\Universidad\\cursos\\Java\\00Proyectos\\Farmacia\\build\\classes\\images\\box.png")); // NOI18N
        jLabelProducts.setText(" Products");

        javax.swing.GroupLayout jPanelProductsLayout = new javax.swing.GroupLayout(jPanelProducts);
        jPanelProducts.setLayout(jPanelProductsLayout);
        jPanelProductsLayout.setHorizontalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProductsLayout.setVerticalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductsLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabelProducts)
                .addContainerGap())
        );

        jPanelPurchase.setBackground(new java.awt.Color(242, 29, 65));

        jLabelPurchase.setBackground(new java.awt.Color(242, 29, 65));
        jLabelPurchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPurchase.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPurchase.setIcon(new javax.swing.ImageIcon("C:\\Users\\leduc\\Desktop\\Universidad\\cursos\\Java\\00Proyectos\\Farmacia\\build\\classes\\images\\purchase.png")); // NOI18N
        jLabelPurchase.setText(" Purchase");

        javax.swing.GroupLayout jPanelPurchaseLayout = new javax.swing.GroupLayout(jPanelPurchase);
        jPanelPurchase.setLayout(jPanelPurchaseLayout);
        jPanelPurchaseLayout.setHorizontalGroup(
            jPanelPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPurchaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPurchaseLayout.setVerticalGroup(
            jPanelPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPurchaseLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabelPurchase)
                .addContainerGap())
        );

        jPanelCustomer.setBackground(new java.awt.Color(242, 29, 65));

        jLabelCustomer.setBackground(new java.awt.Color(242, 29, 65));
        jLabelCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCustomer.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCustomer.setIcon(new javax.swing.ImageIcon("C:\\Users\\leduc\\Desktop\\Universidad\\cursos\\Java\\00Proyectos\\Farmacia\\build\\classes\\images\\customer.png")); // NOI18N
        jLabelCustomer.setText(" Customer");

        javax.swing.GroupLayout jPanelCustomerLayout = new javax.swing.GroupLayout(jPanelCustomer);
        jPanelCustomer.setLayout(jPanelCustomerLayout);
        jPanelCustomerLayout.setHorizontalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustomerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCustomerLayout.setVerticalGroup(
            jPanelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelCustomer)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanelEmployee.setBackground(new java.awt.Color(242, 29, 65));

        jLabelEmployee.setBackground(new java.awt.Color(242, 29, 65));
        jLabelEmployee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEmployee.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmployee.setIcon(new javax.swing.ImageIcon("C:\\Users\\leduc\\Desktop\\Universidad\\cursos\\Java\\00Proyectos\\Farmacia\\build\\classes\\images\\employee.png")); // NOI18N
        jLabelEmployee.setText(" Employee");

        javax.swing.GroupLayout jPanelEmployeeLayout = new javax.swing.GroupLayout(jPanelEmployee);
        jPanelEmployee.setLayout(jPanelEmployeeLayout);
        jPanelEmployeeLayout.setHorizontalGroup(
            jPanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployeeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelEmployeeLayout.setVerticalGroup(
            jPanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmployeeLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabelEmployee)
                .addGap(10, 10, 10))
        );

        jPanelSuppliers.setBackground(new java.awt.Color(242, 29, 65));

        jLabelSuppliers.setBackground(new java.awt.Color(242, 29, 65));
        jLabelSuppliers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSuppliers.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSuppliers.setIcon(new javax.swing.ImageIcon("C:\\Users\\leduc\\Desktop\\Universidad\\cursos\\Java\\00Proyectos\\Farmacia\\build\\classes\\images\\supplier.png")); // NOI18N
        jLabelSuppliers.setText(" Suppliers");

        javax.swing.GroupLayout jPanelSuppliersLayout = new javax.swing.GroupLayout(jPanelSuppliers);
        jPanelSuppliers.setLayout(jPanelSuppliersLayout);
        jPanelSuppliersLayout.setHorizontalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuppliersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSuppliersLayout.setVerticalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuppliersLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelSuppliers)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanelCategory.setBackground(new java.awt.Color(242, 29, 65));

        jLabelCategory.setBackground(new java.awt.Color(242, 29, 65));
        jLabelCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCategory.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCategory.setIcon(new javax.swing.ImageIcon("C:\\Users\\leduc\\Desktop\\Universidad\\cursos\\Java\\00Proyectos\\Farmacia\\build\\classes\\images\\categories.png")); // NOI18N
        jLabelCategory.setText(" Category");

        javax.swing.GroupLayout jPanelCategoryLayout = new javax.swing.GroupLayout(jPanelCategory);
        jPanelCategory.setLayout(jPanelCategoryLayout);
        jPanelCategoryLayout.setHorizontalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCategoryLayout.setVerticalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelCategory)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanelReport.setBackground(new java.awt.Color(242, 29, 65));

        jLabelReport.setBackground(new java.awt.Color(242, 29, 65));
        jLabelReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelReport.setForeground(new java.awt.Color(0, 0, 0));
        jLabelReport.setIcon(new javax.swing.ImageIcon("C:\\Users\\leduc\\Desktop\\Universidad\\cursos\\Java\\00Proyectos\\Farmacia\\build\\classes\\images\\business-report.png")); // NOI18N
        jLabelReport.setText(" Report");

        javax.swing.GroupLayout jPanelReportLayout = new javax.swing.GroupLayout(jPanelReport);
        jPanelReport.setLayout(jPanelReportLayout);
        jPanelReportLayout.setHorizontalGroup(
            jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReport, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelReportLayout.setVerticalGroup(
            jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabelReport)
                .addGap(10, 10, 10))
        );

        jPanelSettings.setBackground(new java.awt.Color(242, 29, 65));

        jLabelSettings.setBackground(new java.awt.Color(242, 29, 65));
        jLabelSettings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSettings.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSettings.setIcon(new javax.swing.ImageIcon("C:\\Users\\leduc\\Desktop\\Universidad\\cursos\\Java\\00Proyectos\\Farmacia\\build\\classes\\images\\settings.png")); // NOI18N
        jLabelSettings.setText(" Settings");

        javax.swing.GroupLayout jPanelSettingsLayout = new javax.swing.GroupLayout(jPanelSettings);
        jPanelSettings.setLayout(jPanelSettingsLayout);
        jPanelSettingsLayout.setHorizontalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSettingsLayout.setVerticalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSettingsLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabelSettings)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout barraIzquierdaLayout = new javax.swing.GroupLayout(barraIzquierda);
        barraIzquierda.setLayout(barraIzquierdaLayout);
        barraIzquierdaLayout.setHorizontalGroup(
            barraIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraIzquierdaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(barraIzquierdaLayout.createSequentialGroup()
                .addGroup(barraIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPurchase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSettings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        barraIzquierdaLayout.setVerticalGroup(
            barraIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraIzquierdaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );

        getContentPane().add(barraIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 170, 530));

        Products.setBackground(new java.awt.Color(218, 213, 183));

        jPanel8.setBackground(new java.awt.Color(194, 183, 155));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Products", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        Code.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Code.setForeground(new java.awt.Color(0, 0, 0));
        Code.setText("Code:");

        Price.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Price.setForeground(new java.awt.Color(0, 0, 0));
        Price.setText("Price:");

        Description.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Description.setForeground(new java.awt.Color(0, 0, 0));
        Description.setText("Description:");

        Id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Id.setForeground(new java.awt.Color(0, 0, 0));
        Id.setText("Id:");

        Category1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Category1.setForeground(new java.awt.Color(0, 0, 0));
        Category1.setText("Category:");

        txtProductName.setBackground(new java.awt.Color(255, 255, 255));

        txtProductCode.setBackground(new java.awt.Color(255, 255, 255));
        txtProductCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductCodeActionPerformed(evt);
            }
        });

        txtProductPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtProductPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductPriceActionPerformed(evt);
            }
        });

        txtProductDescription.setBackground(new java.awt.Color(255, 255, 255));
        txtProductDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductDescriptionActionPerformed(evt);
            }
        });

        cmbProductCategory.setBackground(new java.awt.Color(255, 255, 255));
        cmbProductCategory.setForeground(new java.awt.Color(0, 0, 0));

        txtProductId.setEditable(false);
        txtProductId.setBackground(new java.awt.Color(255, 255, 255));
        txtProductId.setForeground(new java.awt.Color(0, 0, 0));
        txtProductId.setEnabled(false);

        btnProductsRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProductsRegister.setText("Register");
        btnProductsRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsRegisterActionPerformed(evt);
            }
        });

        btnProductsDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProductsDelete.setText("Delete");

        btnProductsModify.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProductsModify.setText("Modify");

        btnProductsCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProductsCancel.setText("Cancel");

        Code1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Code1.setForeground(new java.awt.Color(0, 0, 0));
        Code1.setText("Name:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Code)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Code1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtProductCode, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addComponent(txtProductPrice)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Category1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProductId)
                                    .addComponent(cmbProductCategory, 0, 133, Short.MAX_VALUE))))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProductsRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(btnProductsModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProductsCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProductsDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Code1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Category1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Code, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnProductsDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProductsRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProductsModify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProductsCancel)
                        .addGap(21, 21, 21))))
        );

        searchProducts.setBackground(new java.awt.Color(255, 255, 255));
        searchProducts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchProducts.setForeground(new java.awt.Color(0, 0, 0));
        searchProducts.setText("Search:");

        txtProductSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtProductSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtProductSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductSearchActionPerformed(evt);
            }
        });

        productsTable.setBackground(new java.awt.Color(255, 255, 255));
        productsTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        productsTable.setForeground(new java.awt.Color(0, 0, 0));
        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "Price", "Description", "Category", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(productsTable);
        if (productsTable.getColumnModel().getColumnCount() > 0) {
            productsTable.getColumnModel().getColumn(0).setResizable(false);
            productsTable.getColumnModel().getColumn(1).setResizable(false);
            productsTable.getColumnModel().getColumn(2).setResizable(false);
            productsTable.getColumnModel().getColumn(3).setResizable(false);
            productsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout ProductsLayout = new javax.swing.GroupLayout(Products);
        Products.setLayout(ProductsLayout);
        ProductsLayout.setHorizontalGroup(
            ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(ProductsLayout.createSequentialGroup()
                .addGroup(ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductsLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(searchProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductsLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ProductsLayout.setVerticalGroup(
            ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchProducts)
                    .addComponent(txtProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        MainContent.addTab("Products", Products);

        Purchase.setBackground(new java.awt.Color(218, 213, 183));
        Purchase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(194, 183, 155));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Purchase", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel9.setToolTipText("Purchase");

        productCode.setBackground(new java.awt.Color(102, 102, 102));
        productCode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        productCode.setForeground(new java.awt.Color(0, 0, 0));
        productCode.setText("Product's Code:");

        productName.setBackground(new java.awt.Color(102, 102, 102));
        productName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        productName.setForeground(new java.awt.Color(0, 0, 0));
        productName.setText("Product's Name:");

        Amount.setBackground(new java.awt.Color(102, 102, 102));
        Amount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Amount.setForeground(new java.awt.Color(0, 0, 0));
        Amount.setText("Amount:");

        supplier.setBackground(new java.awt.Color(102, 102, 102));
        supplier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        supplier.setForeground(new java.awt.Color(0, 0, 0));
        supplier.setText("Supplier:");

        purchasePrice.setBackground(new java.awt.Color(102, 102, 102));
        purchasePrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purchasePrice.setForeground(new java.awt.Color(0, 0, 0));
        purchasePrice.setText("Purchase Price:");

        subtotal.setBackground(new java.awt.Color(102, 102, 102));
        subtotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subtotal.setForeground(new java.awt.Color(0, 0, 0));
        subtotal.setText("SubTotal:");

        id.setBackground(new java.awt.Color(102, 102, 102));
        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setText("Id:");

        totalPrice.setBackground(new java.awt.Color(102, 102, 102));
        totalPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalPrice.setForeground(new java.awt.Color(0, 0, 0));
        totalPrice.setText("Total Price:");

        txtPurchaseProductCode.setBackground(new java.awt.Color(255, 255, 255));
        txtPurchaseProductCode.setForeground(new java.awt.Color(0, 0, 0));

        txtPurchaseProductName.setBackground(new java.awt.Color(255, 255, 255));
        txtPurchaseProductName.setForeground(new java.awt.Color(0, 0, 0));

        txtPurchaseAmount.setBackground(new java.awt.Color(255, 255, 255));
        txtPurchaseAmount.setForeground(new java.awt.Color(0, 0, 0));

        txtPurchasePrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPurchasePrice.setForeground(new java.awt.Color(0, 0, 0));

        txtPurchaseSubtotal.setBackground(new java.awt.Color(255, 255, 255));
        txtPurchaseSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        txtPurchaseSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPurchaseSubtotalActionPerformed(evt);
            }
        });

        txtPurchaseId.setEditable(false);
        txtPurchaseId.setBackground(new java.awt.Color(255, 255, 255));
        txtPurchaseId.setForeground(new java.awt.Color(0, 0, 0));
        txtPurchaseId.setFocusable(false);

        txtPurchaseTotalprice.setBackground(new java.awt.Color(255, 255, 255));
        txtPurchaseTotalprice.setForeground(new java.awt.Color(0, 0, 0));

        btnPurchaseAdd.setText("Add");

        btnPurchaseDelete.setText("Delete");
        btnPurchaseDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseDeleteActionPerformed(evt);
            }
        });

        btnPurchaseBuy.setText("Buy");

        btnPurchaseNew.setText("New");
        btnPurchaseNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseNewActionPerformed(evt);
            }
        });

        cbmPurchaseSuppliers.setBackground(new java.awt.Color(255, 255, 255));
        cbmPurchaseSuppliers.setForeground(new java.awt.Color(0, 0, 0));
        cbmPurchaseSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmPurchaseSuppliersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productName)
                    .addComponent(Amount)
                    .addComponent(supplier)
                    .addComponent(productCode))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPurchaseProductCode)
                    .addComponent(txtPurchaseProductName)
                    .addComponent(txtPurchaseAmount)
                    .addComponent(cbmPurchaseSuppliers, 0, 144, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtotal)
                    .addComponent(id)
                    .addComponent(totalPrice)
                    .addComponent(purchasePrice))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPurchaseSubtotal)
                    .addComponent(txtPurchaseId)
                    .addComponent(txtPurchaseTotalprice, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txtPurchasePrice))
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPurchaseAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPurchaseBuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPurchaseDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPurchaseNew, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productCode)
                            .addComponent(purchasePrice)
                            .addComponent(txtPurchaseProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPurchaseAdd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productName)
                    .addComponent(txtPurchaseProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtotal)
                    .addComponent(txtPurchaseSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPurchaseBuy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount)
                    .addComponent(txtPurchaseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id)
                    .addComponent(txtPurchaseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPurchaseDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(supplier)
                        .addComponent(totalPrice)
                        .addComponent(cbmPurchaseSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPurchaseNew)
                        .addComponent(txtPurchaseTotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        Purchase.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 760, 220));

        purchaseTable.setBackground(new java.awt.Color(255, 255, 255));
        purchaseTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        purchaseTable.setForeground(new java.awt.Color(0, 0, 0));
        purchaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product´s Code", "Product´s Name", "Amount", "Suppliers", "Purchase Price", "SubTotal", "Id", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(purchaseTable);
        if (purchaseTable.getColumnModel().getColumnCount() > 0) {
            purchaseTable.getColumnModel().getColumn(0).setResizable(false);
            purchaseTable.getColumnModel().getColumn(0).setHeaderValue("Product´s Code");
            purchaseTable.getColumnModel().getColumn(1).setHeaderValue("Product´s Name");
            purchaseTable.getColumnModel().getColumn(2).setResizable(false);
            purchaseTable.getColumnModel().getColumn(3).setResizable(false);
            purchaseTable.getColumnModel().getColumn(3).setHeaderValue("Suppliers");
            purchaseTable.getColumnModel().getColumn(4).setResizable(false);
            purchaseTable.getColumnModel().getColumn(5).setResizable(false);
            purchaseTable.getColumnModel().getColumn(6).setResizable(false);
            purchaseTable.getColumnModel().getColumn(7).setResizable(false);
        }

        Purchase.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 750, 130));

        MainContent.addTab("Purchase", Purchase);

        Clients.setBackground(new java.awt.Color(218, 213, 183));
        Clients.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(194, 183, 155));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel10.setForeground(new java.awt.Color(0, 0, 0));

        description3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        description3.setForeground(new java.awt.Color(0, 0, 0));
        description3.setText("Identification:");

        fullName3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fullName3.setForeground(new java.awt.Color(0, 0, 0));
        fullName3.setText("Full Name:");

        adress3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adress3.setForeground(new java.awt.Color(0, 0, 0));
        adress3.setText("Address:");

        telephone3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telephone3.setForeground(new java.awt.Color(0, 0, 0));
        telephone3.setText("Telephone:");

        mail3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mail3.setForeground(new java.awt.Color(0, 0, 0));
        mail3.setText("Mail:");

        txtClienIdentification.setBackground(new java.awt.Color(255, 255, 255));

        txtClientFullName.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modify");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");

        jButton5.setText("Cancel");

        txtClientAdress.setBackground(new java.awt.Color(255, 255, 255));

        txtClientTelephone.setBackground(new java.awt.Color(255, 255, 255));

        txtClientMail.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adress3)
                            .addComponent(fullName3))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(description3)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtClientFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(txtClienIdentification)
                    .addComponent(txtClientAdress, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telephone3)
                    .addComponent(mail3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClientMail, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(txtClientTelephone))
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClienIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description3)
                            .addComponent(telephone3)
                            .addComponent(txtClientTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClientFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullName3)
                            .addComponent(mail3)
                            .addComponent(txtClientMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClientAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adress3)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Clients.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 770, 190));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Search:");
        Clients.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));

        txtClientSearch.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(txtClientSearch);

        Clients.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 140, -1));

        tableClients.setBackground(new java.awt.Color(255, 255, 255));
        tableClients.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableClients.setForeground(new java.awt.Color(0, 0, 0));
        tableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Full Name", "Adress", "Telephone", "Mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tableClients);
        if (tableClients.getColumnModel().getColumnCount() > 0) {
            tableClients.getColumnModel().getColumn(0).setResizable(false);
            tableClients.getColumnModel().getColumn(1).setResizable(false);
            tableClients.getColumnModel().getColumn(2).setResizable(false);
            tableClients.getColumnModel().getColumn(3).setResizable(false);
            tableClients.getColumnModel().getColumn(4).setResizable(false);
        }

        Clients.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 750, 130));

        MainContent.addTab("Customer", Clients);

        Employee.setBackground(new java.awt.Color(218, 213, 183));
        Employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(194, 183, 155));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.setToolTipText("Purchase");

        identification.setBackground(new java.awt.Color(102, 102, 102));
        identification.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        identification.setForeground(new java.awt.Color(0, 0, 0));
        identification.setText("Identification:");

        fullName.setBackground(new java.awt.Color(102, 102, 102));
        fullName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fullName.setForeground(new java.awt.Color(0, 0, 0));
        fullName.setText("Full Name:");

        username.setBackground(new java.awt.Color(102, 102, 102));
        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.setText("User Name:");

        rol.setBackground(new java.awt.Color(102, 102, 102));
        rol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rol.setForeground(new java.awt.Color(0, 0, 0));
        rol.setText("Rol:");

        direction.setBackground(new java.awt.Color(102, 102, 102));
        direction.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        direction.setForeground(new java.awt.Color(0, 0, 0));
        direction.setText("Direction:");

        telephone.setBackground(new java.awt.Color(102, 102, 102));
        telephone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telephone.setForeground(new java.awt.Color(0, 0, 0));
        telephone.setText("Telephone:");

        mail.setBackground(new java.awt.Color(102, 102, 102));
        mail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mail.setForeground(new java.awt.Color(0, 0, 0));
        mail.setText("Mail:");

        password.setBackground(new java.awt.Color(102, 102, 102));
        password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setText("Password:");

        txtEmployeeIdentifaction.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployeeIdentifaction.setForeground(new java.awt.Color(0, 0, 0));
        txtEmployeeIdentifaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdentifactionActionPerformed(evt);
            }
        });

        txtEmployeeFullName.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployeeFullName.setForeground(new java.awt.Color(0, 0, 0));

        txtEmployeeUserName.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployeeUserName.setForeground(new java.awt.Color(0, 0, 0));

        txtEmployeeDirecction.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployeeDirecction.setForeground(new java.awt.Color(0, 0, 0));

        txtEmployeeTelephone.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployeeTelephone.setForeground(new java.awt.Color(0, 0, 0));
        txtEmployeeTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeTelephoneActionPerformed(evt);
            }
        });

        txtEmployeeMail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployeeMail.setForeground(new java.awt.Color(0, 0, 0));

        btnEmployeeRegister.setText("Register");

        btnEmployeeDelete.setText("Delete");
        btnEmployeeDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeDeleteActionPerformed(evt);
            }
        });

        btnEmployeeModify.setText("Modify");

        btnEmployeeCancel.setText("Cancel");
        btnEmployeeCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeCancelActionPerformed(evt);
            }
        });

        cmbEmployeeRol.setBackground(new java.awt.Color(255, 255, 255));
        cmbEmployeeRol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbEmployeeRol.setForeground(new java.awt.Color(0, 0, 0));
        cmbEmployeeRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adminstrator", "Auxiliary" }));
        cmbEmployeeRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeRolActionPerformed(evt);
            }
        });

        txtEmployeePassword.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployeePassword.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(identification)
                    .addComponent(fullName)
                    .addComponent(rol)
                    .addComponent(username))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmployeeFullName)
                    .addComponent(txtEmployeeUserName)
                    .addComponent(cmbEmployeeRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmployeeIdentifaction, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mail)
                            .addComponent(password)
                            .addComponent(direction))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telephone)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmployeeDirecction, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(txtEmployeeTelephone)
                    .addComponent(txtEmployeeMail)
                    .addComponent(txtEmployeePassword))
                .addGap(33, 33, 33)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEmployeeRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmployeeModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmployeeDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmployeeCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(identification)
                            .addComponent(direction)
                            .addComponent(txtEmployeeIdentifaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployeeDirecction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEmployeeRegister)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullName)
                    .addComponent(txtEmployeeFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployeeModify)
                    .addComponent(telephone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(txtEmployeeUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mail)
                    .addComponent(txtEmployeeMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployeeDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rol)
                        .addComponent(cmbEmployeeRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEmployeeCancel)
                        .addComponent(password)
                        .addComponent(txtEmployeePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Employee.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 760, -1));

        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(0, 0, 0));
        search.setText("Search:");
        Employee.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setForeground(new java.awt.Color(255, 255, 255));

        txtEmployeeSearch.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setViewportView(txtEmployeeSearch);

        Employee.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 140, -1));

        EmployeeTable.setBackground(new java.awt.Color(255, 255, 255));
        EmployeeTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EmployeeTable.setForeground(new java.awt.Color(0, 0, 0));
        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identification", "Full Name", "User Name", "Rol", "Direction", "Telephone", "Mail", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(EmployeeTable);

        Employee.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 750, 130));

        MainContent.addTab("Employee", Employee);

        Suppliers.setBackground(new java.awt.Color(218, 213, 183));
        Suppliers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(194, 183, 155));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Suppliers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.setToolTipText("Purchase");

        name5.setBackground(new java.awt.Color(102, 102, 102));
        name5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name5.setForeground(new java.awt.Color(0, 0, 0));
        name5.setText("Name:");

        direction5.setBackground(new java.awt.Color(102, 102, 102));
        direction5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        direction5.setForeground(new java.awt.Color(0, 0, 0));
        direction5.setText("Direction:");

        telephone5.setBackground(new java.awt.Color(102, 102, 102));
        telephone5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telephone5.setForeground(new java.awt.Color(0, 0, 0));
        telephone5.setText("Telephone:");

        mail5.setBackground(new java.awt.Color(102, 102, 102));
        mail5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mail5.setForeground(new java.awt.Color(0, 0, 0));
        mail5.setText("Mail:");

        description.setBackground(new java.awt.Color(102, 102, 102));
        description.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        description.setForeground(new java.awt.Color(0, 0, 0));
        description.setText("Description:");

        city.setBackground(new java.awt.Color(102, 102, 102));
        city.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        city.setForeground(new java.awt.Color(0, 0, 0));
        city.setText("City:");

        id5.setBackground(new java.awt.Color(102, 102, 102));
        id5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id5.setForeground(new java.awt.Color(0, 0, 0));
        id5.setText("Id:");

        txtSuppliersName.setBackground(new java.awt.Color(255, 255, 255));
        txtSuppliersName.setForeground(new java.awt.Color(0, 0, 0));
        txtSuppliersName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuppliersNameActionPerformed(evt);
            }
        });

        txtSuppliersDirection.setBackground(new java.awt.Color(255, 255, 255));
        txtSuppliersDirection.setForeground(new java.awt.Color(0, 0, 0));

        txtSuppliersTelephone.setBackground(new java.awt.Color(255, 255, 255));
        txtSuppliersTelephone.setForeground(new java.awt.Color(0, 0, 0));

        txtSuppliersDescription.setBackground(new java.awt.Color(255, 255, 255));
        txtSuppliersDescription.setForeground(new java.awt.Color(0, 0, 0));

        txtSuppliersMail.setBackground(new java.awt.Color(255, 255, 255));
        txtSuppliersMail.setForeground(new java.awt.Color(0, 0, 0));
        txtSuppliersMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuppliersMailActionPerformed(evt);
            }
        });

        btnSuppliersRegister1.setText("Register");

        btnSuppliersDelete1.setText("Delete");
        btnSuppliersDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppliersDelete1ActionPerformed(evt);
            }
        });

        btnSuppliersModify.setText("Modify");

        btnSuppliersCancel.setText("Cancel");
        btnSuppliersCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppliersCancelActionPerformed(evt);
            }
        });

        cbmSuppliersCity.setBackground(new java.awt.Color(255, 255, 255));
        cbmSuppliersCity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbmSuppliersCity.setForeground(new java.awt.Color(0, 0, 0));
        cbmSuppliersCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buenos Aires", "Cordoba" }));
        cbmSuppliersCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmSuppliersCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name5)
                    .addComponent(direction5)
                    .addComponent(mail5)
                    .addComponent(telephone5))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSuppliersDirection)
                    .addComponent(txtSuppliersTelephone)
                    .addComponent(txtSuppliersName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSuppliersMail))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id5)
                            .addComponent(description)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(city)))
                .addGap(22, 22, 22)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSuppliersDescription)
                    .addComponent(cbmSuppliersCity, 0, 152, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSuppliersRegister1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuppliersModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuppliersDelete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuppliersCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name5)
                            .addComponent(description)
                            .addComponent(txtSuppliersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSuppliersRegister1)
                            .addComponent(txtSuppliersDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direction5)
                    .addComponent(txtSuppliersDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuppliersModify)
                    .addComponent(city)
                    .addComponent(cbmSuppliersCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephone5)
                    .addComponent(txtSuppliersTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id5)
                    .addComponent(btnSuppliersDelete1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mail5)
                        .addComponent(txtSuppliersMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSuppliersCancel))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Suppliers.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 760, -1));

        search1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search1.setForeground(new java.awt.Color(0, 0, 0));
        search1.setText("Search:");
        Suppliers.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jScrollPane11.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane11.setForeground(new java.awt.Color(255, 255, 255));

        txtEmployeeSearch1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane11.setViewportView(txtEmployeeSearch1);

        Suppliers.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 140, -1));

        SuppliersTable.setBackground(new java.awt.Color(255, 255, 255));
        SuppliersTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SuppliersTable.setForeground(new java.awt.Color(0, 0, 0));
        SuppliersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Direction", "Telephone", "Mail", "Description", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(SuppliersTable);
        if (SuppliersTable.getColumnModel().getColumnCount() > 0) {
            SuppliersTable.getColumnModel().getColumn(0).setResizable(false);
            SuppliersTable.getColumnModel().getColumn(1).setResizable(false);
            SuppliersTable.getColumnModel().getColumn(2).setResizable(false);
            SuppliersTable.getColumnModel().getColumn(2).setHeaderValue("Telephone");
            SuppliersTable.getColumnModel().getColumn(3).setResizable(false);
            SuppliersTable.getColumnModel().getColumn(3).setHeaderValue("Mail");
            SuppliersTable.getColumnModel().getColumn(4).setResizable(false);
            SuppliersTable.getColumnModel().getColumn(4).setHeaderValue("Description");
            SuppliersTable.getColumnModel().getColumn(5).setResizable(false);
            SuppliersTable.getColumnModel().getColumn(5).setHeaderValue("City");
        }

        Suppliers.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 750, 130));

        MainContent.addTab("Suppliers", Suppliers);

        Category.setBackground(new java.awt.Color(218, 213, 183));
        Category.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(194, 183, 155));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel14.setToolTipText("Purchase");

        id6.setBackground(new java.awt.Color(102, 102, 102));
        id6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id6.setForeground(new java.awt.Color(0, 0, 0));
        id6.setText("Id:");

        name6.setBackground(new java.awt.Color(102, 102, 102));
        name6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name6.setForeground(new java.awt.Color(0, 0, 0));
        name6.setText("Name:");

        txtSuppliersName2.setEditable(false);
        txtSuppliersName2.setBackground(new java.awt.Color(255, 255, 255));
        txtSuppliersName2.setForeground(new java.awt.Color(0, 0, 0));
        txtSuppliersName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuppliersName2ActionPerformed(evt);
            }
        });

        txtCategoryName1.setBackground(new java.awt.Color(255, 255, 255));
        txtCategoryName1.setForeground(new java.awt.Color(0, 0, 0));
        txtCategoryName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryName1ActionPerformed(evt);
            }
        });

        btnCategoryRegister.setText("Register");

        btnCategoryDelete.setText("Delete");
        btnCategoryDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryDeleteActionPerformed(evt);
            }
        });

        btnCategoryModify.setText("Modify");

        btnCategoryCancel.setText("Cancel");
        btnCategoryCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name6)
                    .addComponent(id6))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCategoryName1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSuppliersName2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCategoryCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoryModify, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoryRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id6)
                            .addComponent(txtSuppliersName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name6)
                            .addComponent(txtCategoryName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCategoryRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategoryModify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCategoryDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategoryCancel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Category.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 430, -1));

        search6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search6.setForeground(new java.awt.Color(0, 0, 0));
        search6.setText("Search:");
        Category.add(search6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jScrollPane15.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane15.setForeground(new java.awt.Color(255, 255, 255));

        txtEmployeeSearch2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane15.setViewportView(txtEmployeeSearch2);

        Category.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 140, -1));

        SuppliersTable1.setBackground(new java.awt.Color(255, 255, 255));
        SuppliersTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SuppliersTable1.setForeground(new java.awt.Color(0, 0, 0));
        SuppliersTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane16.setViewportView(SuppliersTable1);
        if (SuppliersTable1.getColumnModel().getColumnCount() > 0) {
            SuppliersTable1.getColumnModel().getColumn(0).setResizable(false);
            SuppliersTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        Category.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 340, 210));

        MainContent.addTab("Category", Category);

        Reports.setBackground(new java.awt.Color(218, 213, 183));
        Reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Purchases.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Purchases.setForeground(new java.awt.Color(0, 0, 0));
        Purchases.setText("Purchases");
        Reports.add(Purchases, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 130, 60));

        tableAllPurchases.setBackground(new java.awt.Color(255, 255, 255));
        tableAllPurchases.setForeground(new java.awt.Color(0, 0, 0));
        tableAllPurchases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bills", "Supplier", "Total", "Purchase Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableAllPurchases);
        if (tableAllPurchases.getColumnModel().getColumnCount() > 0) {
            tableAllPurchases.getColumnModel().getColumn(0).setResizable(false);
            tableAllPurchases.getColumnModel().getColumn(1).setResizable(false);
            tableAllPurchases.getColumnModel().getColumn(2).setResizable(false);
            tableAllPurchases.getColumnModel().getColumn(3).setResizable(false);
        }

        Reports.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 770, 200));

        MainContent.addTab("Reports", Reports);

        Profile.setBackground(new java.awt.Color(218, 213, 183));
        Profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(194, 183, 155));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel15.setToolTipText("Purchase");

        identification8.setBackground(new java.awt.Color(102, 102, 102));
        identification8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        identification8.setForeground(new java.awt.Color(0, 0, 0));
        identification8.setText("Identification:");

        fullName8.setBackground(new java.awt.Color(102, 102, 102));
        fullName8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fullName8.setForeground(new java.awt.Color(0, 0, 0));
        fullName8.setText("Full Name:");

        address8.setBackground(new java.awt.Color(102, 102, 102));
        address8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        address8.setForeground(new java.awt.Color(0, 0, 0));
        address8.setText("Address:");

        telephone8.setBackground(new java.awt.Color(102, 102, 102));
        telephone8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telephone8.setForeground(new java.awt.Color(0, 0, 0));
        telephone8.setText("Telephone:");

        newPassword.setBackground(new java.awt.Color(102, 102, 102));
        newPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newPassword.setForeground(new java.awt.Color(0, 0, 0));
        newPassword.setText("New Password:");

        confirmPassword.setBackground(new java.awt.Color(102, 102, 102));
        confirmPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmPassword.setForeground(new java.awt.Color(0, 0, 0));
        confirmPassword.setText("Confirm Password:");

        txtProfileIdentification.setEditable(false);
        txtProfileIdentification.setBackground(new java.awt.Color(255, 255, 255));
        txtProfileIdentification.setForeground(new java.awt.Color(0, 0, 0));
        txtProfileIdentification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfileIdentificationActionPerformed(evt);
            }
        });

        txtProfileFullName.setEditable(false);
        txtProfileFullName.setBackground(new java.awt.Color(255, 255, 255));
        txtProfileFullName.setForeground(new java.awt.Color(0, 0, 0));

        txtProfileAdress.setEditable(false);
        txtProfileAdress.setBackground(new java.awt.Color(255, 255, 255));
        txtProfileAdress.setForeground(new java.awt.Color(0, 0, 0));
        txtProfileAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfileAdressActionPerformed(evt);
            }
        });

        txtProfileConfirmPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtProfileConfirmPassword.setForeground(new java.awt.Color(0, 0, 0));

        txtProfileTelephone.setEditable(false);
        txtProfileTelephone.setBackground(new java.awt.Color(255, 255, 255));
        txtProfileTelephone.setForeground(new java.awt.Color(0, 0, 0));
        txtProfileTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfileTelephoneActionPerformed(evt);
            }
        });

        btnProfileModify.setText("Modify");

        mail8.setBackground(new java.awt.Color(102, 102, 102));
        mail8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mail8.setForeground(new java.awt.Color(0, 0, 0));
        mail8.setText("Mail:");

        txtProfileMail.setEditable(false);
        txtProfileMail.setBackground(new java.awt.Color(255, 255, 255));
        txtProfileMail.setForeground(new java.awt.Color(0, 0, 0));
        txtProfileMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfileMailActionPerformed(evt);
            }
        });

        txtProfileNewPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtProfileNewPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtProfileNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfileNewPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(identification8)
                    .addComponent(fullName8)
                    .addComponent(address8)
                    .addComponent(mail8)
                    .addComponent(telephone8))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(txtProfileTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProfileFullName)
                            .addComponent(txtProfileAdress)
                            .addComponent(txtProfileIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfileMail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPassword)
                            .addComponent(newPassword))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProfileConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfileNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(btnProfileModify, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(identification8)
                            .addComponent(newPassword)
                            .addComponent(txtProfileIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfileNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullName8)
                            .addComponent(txtProfileFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPassword)
                            .addComponent(txtProfileConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address8)
                            .addComponent(txtProfileAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnProfileModify)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephone8)
                    .addComponent(txtProfileTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail8)
                    .addComponent(txtProfileMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        Profile.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 760, 370));

        MainContent.addTab("Profile", Profile);

        getContentPane().add(MainContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 830, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed

    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed

    }//GEN-LAST:event_btnLogOutActionPerformed

    private void txtProductPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductPriceActionPerformed

    private void txtProductDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductDescriptionActionPerformed

    private void txtProductCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductCodeActionPerformed

    private void txtProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductSearchActionPerformed

    private void btnProductsRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductsRegisterActionPerformed

    private void txtPurchaseSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPurchaseSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPurchaseSubtotalActionPerformed

    private void btnPurchaseNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPurchaseNewActionPerformed

    private void btnPurchaseDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPurchaseDeleteActionPerformed

    private void cbmPurchaseSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmPurchaseSuppliersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmPurchaseSuppliersActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEmployeeTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeTelephoneActionPerformed

    private void btnEmployeeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeeDeleteActionPerformed

    private void btnEmployeeCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeeCancelActionPerformed

    private void cmbEmployeeRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmployeeRolActionPerformed

    private void txtEmployeeIdentifactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdentifactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIdentifactionActionPerformed

    private void txtSuppliersNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuppliersNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuppliersNameActionPerformed

    private void txtSuppliersMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuppliersMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuppliersMailActionPerformed

    private void btnSuppliersDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliersDelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuppliersDelete1ActionPerformed

    private void btnSuppliersCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliersCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuppliersCancelActionPerformed

    private void cbmSuppliersCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmSuppliersCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmSuppliersCityActionPerformed

    private void txtCategoryName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryName1ActionPerformed

    private void btnCategoryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCategoryDeleteActionPerformed

    private void btnCategoryCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCategoryCancelActionPerformed

    private void txtSuppliersName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuppliersName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuppliersName2ActionPerformed

    private void txtProfileIdentificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfileIdentificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfileIdentificationActionPerformed

    private void txtProfileTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfileTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfileTelephoneActionPerformed

    private void txtProfileMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfileMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfileMailActionPerformed

    private void txtProfileNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfileNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfileNewPasswordActionPerformed

    private void txtProfileAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfileAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfileAdressActionPerformed

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemView().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JPanel Category;
    private javax.swing.JLabel Category1;
    private javax.swing.JPanel Clients;
    private javax.swing.JLabel Code;
    private javax.swing.JLabel Code1;
    private javax.swing.JLabel Description;
    private javax.swing.JPanel Employee;
    public javax.swing.JTable EmployeeTable;
    private javax.swing.JLabel Id;
    public javax.swing.JTabbedPane MainContent;
    private javax.swing.JLabel Price;
    private javax.swing.JPanel Products;
    private javax.swing.JPanel Profile;
    private javax.swing.JPanel Purchase;
    private javax.swing.JLabel Purchases;
    private javax.swing.JPanel Reports;
    private javax.swing.JPanel Suppliers;
    public javax.swing.JTable SuppliersTable;
    public javax.swing.JTable SuppliersTable1;
    private javax.swing.JLabel address8;
    private javax.swing.JLabel adress3;
    private javax.swing.JPanel barraIzquierda;
    public javax.swing.JButton btnCategoryCancel;
    public javax.swing.JButton btnCategoryDelete;
    public javax.swing.JButton btnCategoryModify;
    public javax.swing.JButton btnCategoryRegister;
    public javax.swing.JButton btnEmployeeCancel;
    public javax.swing.JButton btnEmployeeDelete;
    public javax.swing.JButton btnEmployeeModify;
    public javax.swing.JButton btnEmployeeRegister;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnLogOut;
    public javax.swing.JButton btnProductsCancel;
    public javax.swing.JButton btnProductsDelete;
    public javax.swing.JButton btnProductsModify;
    public javax.swing.JButton btnProductsRegister;
    public javax.swing.JButton btnProfileModify;
    public javax.swing.JButton btnPurchaseAdd;
    public javax.swing.JButton btnPurchaseBuy;
    public javax.swing.JButton btnPurchaseDelete;
    public javax.swing.JButton btnPurchaseNew;
    public javax.swing.JButton btnSuppliersCancel;
    public javax.swing.JButton btnSuppliersDelete1;
    public javax.swing.JButton btnSuppliersModify;
    public javax.swing.JButton btnSuppliersRegister1;
    private javax.swing.JPanel cabezado;
    public javax.swing.JComboBox<String> cbmPurchaseSuppliers;
    public javax.swing.JComboBox<String> cbmSuppliersCity;
    private javax.swing.JLabel city;
    public javax.swing.JComboBox<String> cmbEmployeeRol;
    public javax.swing.JComboBox<Object> cmbProductCategory;
    private javax.swing.JLabel confirmPassword;
    private javax.swing.JLabel description;
    private javax.swing.JLabel description3;
    private javax.swing.JLabel direction;
    private javax.swing.JLabel direction5;
    private javax.swing.JLabel fullName;
    private javax.swing.JLabel fullName3;
    private javax.swing.JLabel fullName8;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id5;
    private javax.swing.JLabel id6;
    private javax.swing.JLabel identification;
    private javax.swing.JLabel identification8;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabelCategory;
    public javax.swing.JLabel jLabelCustomer;
    public javax.swing.JLabel jLabelEmployee;
    public javax.swing.JLabel jLabelProducts;
    public javax.swing.JLabel jLabelPurchase;
    public javax.swing.JLabel jLabelReport;
    public javax.swing.JLabel jLabelSettings;
    public javax.swing.JLabel jLabelSuppliers;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPanel jPanelCategory;
    public javax.swing.JPanel jPanelCustomer;
    public javax.swing.JPanel jPanelEmployee;
    public javax.swing.JPanel jPanelProducts;
    public javax.swing.JPanel jPanelPurchase;
    public javax.swing.JPanel jPanelReport;
    public javax.swing.JPanel jPanelSettings;
    public javax.swing.JPanel jPanelSuppliers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel logo;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel mail3;
    private javax.swing.JLabel mail5;
    private javax.swing.JLabel mail8;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel newPassword;
    private javax.swing.JLabel password;
    private javax.swing.JLabel productCode;
    private javax.swing.JLabel productName;
    public javax.swing.JTable productsTable;
    private javax.swing.JLabel purchasePrice;
    public javax.swing.JTable purchaseTable;
    private javax.swing.JLabel rol;
    private javax.swing.JLabel search;
    private javax.swing.JLabel search1;
    private javax.swing.JLabel search6;
    private javax.swing.JLabel searchProducts;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel supplier;
    private javax.swing.JTable tableAllPurchases;
    public javax.swing.JTable tableClients;
    private javax.swing.JLabel telephone;
    private javax.swing.JLabel telephone3;
    private javax.swing.JLabel telephone5;
    private javax.swing.JLabel telephone8;
    private javax.swing.JLabel totalPrice;
    public javax.swing.JTextField txtCategoryName1;
    public javax.swing.JTextField txtClienIdentification;
    public javax.swing.JTextField txtClientAdress;
    public javax.swing.JTextField txtClientFullName;
    public javax.swing.JTextField txtClientMail;
    public javax.swing.JTextPane txtClientSearch;
    public javax.swing.JTextField txtClientTelephone;
    public javax.swing.JTextField txtEmployeeDirecction;
    public javax.swing.JTextField txtEmployeeFullName;
    public javax.swing.JTextField txtEmployeeIdentifaction;
    public javax.swing.JTextField txtEmployeeMail;
    public javax.swing.JPasswordField txtEmployeePassword;
    public javax.swing.JTextPane txtEmployeeSearch;
    public javax.swing.JTextPane txtEmployeeSearch1;
    public javax.swing.JTextPane txtEmployeeSearch2;
    public javax.swing.JTextField txtEmployeeTelephone;
    public javax.swing.JTextField txtEmployeeUserName;
    public javax.swing.JTextField txtProductCode;
    public javax.swing.JTextField txtProductDescription;
    public javax.swing.JTextField txtProductId;
    public javax.swing.JTextField txtProductName;
    public javax.swing.JTextField txtProductPrice;
    public javax.swing.JTextField txtProductSearch;
    public javax.swing.JTextField txtProfileAdress;
    public javax.swing.JTextField txtProfileConfirmPassword;
    public javax.swing.JTextField txtProfileFullName;
    public javax.swing.JTextField txtProfileIdentification;
    public javax.swing.JTextField txtProfileMail;
    public javax.swing.JTextField txtProfileNewPassword;
    public javax.swing.JTextField txtProfileTelephone;
    public javax.swing.JTextField txtPurchaseAmount;
    public javax.swing.JTextField txtPurchaseId;
    public javax.swing.JTextField txtPurchasePrice;
    public javax.swing.JTextField txtPurchaseProductCode;
    public javax.swing.JTextField txtPurchaseProductName;
    public javax.swing.JTextField txtPurchaseSubtotal;
    public javax.swing.JTextField txtPurchaseTotalprice;
    public javax.swing.JTextField txtSuppliersDescription;
    public javax.swing.JTextField txtSuppliersDirection;
    public javax.swing.JTextField txtSuppliersMail;
    public javax.swing.JTextField txtSuppliersName;
    public javax.swing.JTextField txtSuppliersName2;
    public javax.swing.JTextField txtSuppliersTelephone;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
