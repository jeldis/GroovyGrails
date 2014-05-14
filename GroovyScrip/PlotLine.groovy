@Grab(group='jfree', module='jfreechart', version='1.0.5')
@Grab(group='jfree', module='jcommon', version='1.0.9')

import org.jfree.chart.ChartFactory
import org.jfree.chart.ChartPanel
import org.jfree.data.category.DefaultCategoryDataset
import org.jfree.chart.plot.PlotOrientation as Orientation
import groovy.swing.SwingBuilder
import javax.swing.WindowConstants as WC

def dataset = new DefaultCategoryDataset()
dataset.with{
    addValue 150, "no.1", "Jan"
    addValue 210, "no.1", "Feb"
    addValue 390, "no.1", "Mar"
    addValue 300, "no.2", "Jan"
    addValue 400, "no.2", "Feb"
    addValue 200, "no.2", "Mar"
}

def labels = ["Bugs", "Month", "Count"]
def options = [true, true, true]
def chart = ChartFactory.createLineChart(*labels, dataset,
                Orientation.VERTICAL, *options)
def swing = new SwingBuilder()
def frame = swing.frame(title:'Groovy LineChart',
        defaultCloseOperation:WC.EXIT_ON_CLOSE) {
    panel(id:'canvas') { widget(new ChartPanel(chart)) }
}
frame.pack()
frame.show()
