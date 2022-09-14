Set<Individual> genetic() {
	int populationSize = 50
	int generation = 0;
	
	// start with a random population
	Set<Individual> population = randomGeneration(populationSize);
	
	// iterate till the termination condition is met
	while(isTerminationConditionMet()) {
		Set<Individual> selection = selectIndividuals(population);
		
		crossover(selection);
		mutate(selection);
		population = selection;
		
		generation++;
	}
	
	// return last generation
	return population;
}