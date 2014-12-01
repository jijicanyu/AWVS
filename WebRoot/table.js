Ext.onReady(function(){
	var sm = new Ext.grid.CheckboxSelectionModel();
	
	var cm = new Ext.grid.ColumnModel([//sortable true 支持排序
		new Ext.grid.RowNumberer(), //自动显示行号
		sm,
		{header: '编号',dataIndex:'id' , sortable:true},	
		{header: '名称',dataIndex:'name'},
		{header: '描述',dataIndex:'descn'}
	]);
   var data = [
        ['1', 'name1','descn1'],
        ['2', 'name2','descn2'],
        ['3', 'name3','descn3'],
        ['4', 'name4','descn4'],
        ['5', 'name5','descn5']
    ];
    
	// 索引是从0开始的，如果对应的方式不一样，需要在后面加入mapping:0 
	var store = new Ext.data.Store({
		proxy : new Ext.data.MemoryProxy(data),
		
		//proxy:new Ext.data.ScriptTagProxy({url:'http://www.121.com/data.json'}),
		reader: new Ext.data.ArrayReader({}, [
		{name : 'id'},
		{name : 'name'},
		{name : 'descn'}
		])
	});
	
	store.load();
	
   var grid = new Ext.grid.GridPanel({
    //autoHeight:true,
    height:800,
    width:500,
    border:0,
   renderTo:'grid',
   store:store,
    cm:cm,
  // sm:sm,
  sm:new Ext.grid.RowSelectionModel({singleSelect:true}),
   // 是否可以移动
   //enableColumnMove: false,
   // 是否可以修改大小
   //enableColumnResize:false
   // 斑马线效果
   stripeRows:true,
   loadMask:true,
   // 自动设置表格宽度，如果须固定，需要在ColumnModel中设置字段width
//   viewConfig:{
//    forceFit: true
//   }
   
   iconCls: 'icon-grid'

});
});