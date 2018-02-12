#!/bin/bash
javac -d mods/br.com.vtferrari.domain --module-path mods src/main/br.com.vtferrari.domain/module-info.java        src/main/br.com.vtferrari.domain/br/com/vtferrari/domain/model/Product.java
javac -d mods/br.com.vtferrari.http        --module-path mods src/main/br.com.vtferrari.http/module-info.java          src/main/br.com.vtferrari.http/br/com/vtferrari/http/ProductIntegration.java
javac -d mods/br.com.vtferrari.integration --module-path mods src/main/br.com.vtferrari.integration/module-info.java   src/main/br.com.vtferrari.integration/br/com/vtferrari/integration/model/Invoice.java  src/main/br.com.vtferrari.integration/br/com/vtferrari/integration/ws/GovernmentWebService.java  src/main/br.com.vtferrari.integration/br/com/vtferrari/integration/ws/InvoiceSubscribe.java src/main/br.com.vtferrari.integration/br/com/vtferrari/integration/service/TransmitInvoice.java
javac -d mods/br.com.vtferrari             --module-path mods src/main/br.com.vtferrari.http/module-info.java          src/main/br.com.vtferrari/br/com/vtferrari/JvanoveApplication.java