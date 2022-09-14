Archive<Individual> dyna() {
	int populationSize = 50
	int generation = 0;
	
	// start with a random population
	Set<Individual> population = randomGeneration(populationSize);
	
	// set of multiple targets
	Set<Target> targets = getTargets();
	
	// keep track of target covering individuals
	Archive<Individual> archive = new Archive<Individual>();
	archive.update(population);
	
	DependencyGraph graph = getDependencyGraph()
	
	// iterate till the termination condition is met
	while(isTerminationConditionMet()) {
		Set<Individual> offspring = breedOffspring(population);
		archive.update(offspring);
		
		// update targets
		targets = updateTargets(targets, graph)
		
		population.addAll(offspring);
		population = selectByRanks(population, targets);
		
		generation++;
	}
	
	// return the archive as artificial last generation
	return archive;
}