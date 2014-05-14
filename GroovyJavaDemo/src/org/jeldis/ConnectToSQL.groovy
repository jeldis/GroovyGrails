/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jeldis

def sql = groovy.sql.Sql.newInstance('jdbc:mysql://localhost:3306/weatherinfo', 'root', '','com.mysql.jdbc.Driver')
println(sql.connection.catalog)
    
sql.eachRow('SELECT * fromweather'){
    printf "%-20s%s\n", it.city,it[1]
}
