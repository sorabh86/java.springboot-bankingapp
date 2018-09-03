console.log('JAVASCRIPT IS WORKING');

(function($){
    $.toggleShowPassword = function(options) {
        var settings = $.extend({
            field:"#password",
            control:'#showPassword',
        }, options);
        
        var control = $(settings.control);
        var field = $(settings.field);
        
        control.bind('click', function(){
            if(control.is(':checked')) {
                field.attr('type', 'text');
            } else {
                field.attr('type', 'password');
            }
        })
    }
})(jQuery);