from graphviz import Source


s = Source.from_file("C:\\Users\\kha\\repos\\master-kolloquium\\figures\\dot\\flowchart_component_search_3.dot")
s.render(format='pdf',view=False)