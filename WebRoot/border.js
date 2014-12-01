Ext.onReady(function(){

    var viewport = new Ext.Viewport({
    layout:"border",
    items:[
        {region:"north",title:"Up",height:100,collapsible: true},
        //{region:"south",title:"Down",height:50},
        {region:"west",title:"Left",width:200,collapsible: true},
        //{region:"east",title:"Right",width:200},
        {
        region:"center",
        collapsible: true,
        title:"Center",
        xtype: 'tabpanel', // TabPanel itself has no title
        items: {
            title: 'Default Tab',
            html: 'The first tab\'s content. Others may be added dynamically'
        }}
    ]
});
});



