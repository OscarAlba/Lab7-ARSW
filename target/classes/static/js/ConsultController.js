/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var ConsultControllerModule = (function (){
    
    
    var getConsult = function(id, type){
        
        var callback = {
            onSuccess: function(response){
                var property = Object.keys(response);
                
                $('#tableConsult').empty();
                //<br> Symbol: '"+response[property[0]]['2. Symbol'].toString()+"'<br> Last Refreshed: '"+response[property[0]]['3. Last Refreshed'].toString()+"'
                $('#tableConsult').append("<thead> <tr> <td colspan='6' align='center'> Information: "+response[property[0]]['1. Information'].toString()+" <br> Symbol: "+response[property[0]]['2. Symbol'].toString()+" <br> Last Refreshed: "+response[property[0]]['3. Last Refreshed'].toString()+"</td> </caption>");
                $('#tableConsult').append("<tr> <th class='col'>Date</th> <th class='col'>Open</th> <th class='col'>High</th> <th class='col'>Low</th> <th class='col'>Close</th> <th class='col'>Volume</th> </tr> </thead>");
                for (i in response[property[1]]){
                    $('#tableConsult').append("<tbody> <tr> <td> <a>"+i+"</a> </td> <td> <a>"+response[property[1]][i]['1. open']+"</a> </td> <td> <a>"+response[property[1]][i]['2. high']+"</a> </td> <td> <a>"+response[property[1]][i]['3. low']+"</a> </td> <td> <a>"+response[property[1]][i]['4. close']+"</a> </td> <td> <a>"+response[property[1]][i]['5. volume']+"</a> </td> </tr> </tbody>");
                }
            },
            onFailed: function(exception){
                console.log(exception);
                alert("There is a problem with our servers.");
            }
        };
        RestControllerModule.getConsult(id,type,callback);
    };
    
    return {
        getConsult: getConsult
    };
})();    