/**
 * Created by fauzi on 2/25/19.
 */

$('#bt-reset').on('click', function(){
    $('#inputPlainWord').text('');
    $('#result').text('');
});

$('#bt-submit').on('click', function(e){
    e.preventDefault();
    var plainText = $('#inputPlainWord').val();
    var url = "/mess?text="+plainText;
    $.ajax({
        type : 'GET',
        url : url,
        success: function( data, textStatus, jQxhr ){
            console.log(data);
            console.log(textStatus);
            $('#result').text(data);
        },
        error: function( jqXhr, textStatus, errorThrown ){
            console.log(jqXhr)
        }
    });
});